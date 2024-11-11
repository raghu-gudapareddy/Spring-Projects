package hotelmanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


import org.springframework.stereotype.Component;

import hotelmanagementsystem.model.Hotel;

import java.util.List;

@Component
public class Itemdao {

    // Inject EntityManager for JPA operations
    @PersistenceContext
    private EntityManager entityManager;

    // Create Item
    @Transactional
    public void createItem(Hotel item) {
        if (item.getSno() == 0) {
            entityManager.persist(item);  // For new products, use persist
        } else {
            entityManager.merge(item);    // For updating existing products, use merge
        }
    }

    // Getting all Items
    public List<Hotel> getItems() {
        // Using JPQL to fetch all items
        return entityManager.createQuery("SELECT p FROM Hotel p", Hotel.class)
                            .getResultList();
    }

    // Delete single Item
    @Transactional
    public void deleteItem(int pid) {
        Hotel item = entityManager.find(Hotel.class, pid);
        if (item != null) {
            entityManager.remove(item);
        }
    }

    // Get single Item
    public Hotel getItem(int pid) {
        return entityManager.find(Hotel.class, pid);
    }

}