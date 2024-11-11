package productcrudapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

import java.util.List;

@Component
public class ProductDao {

    // Inject EntityManager for JPA operations
    @PersistenceContext
    private EntityManager entityManager;

    // Create Product
    @Transactional
    public void createProduct(Product product) {
        if (product.getId() == 0) {
            entityManager.persist(product);  // For new products, use persist
        } else {
            entityManager.merge(product);    // For updating existing products, use merge
        }
    }

    // Getting all Products
    public List<Product> getProducts() {
        // Using JPQL to fetch all products
        return entityManager.createQuery("SELECT p FROM Product p", Product.class)
                            .getResultList();
    }

    // Delete single Product
    @Transactional
    public void deleteProduct(int pid) {
        Product product = entityManager.find(Product.class, pid);
        if (product != null) {
            entityManager.remove(product);
        }
    }

    // Get single Product
    public Product getProduct(int pid) {
        return entityManager.find(Product.class, pid);
    }
}