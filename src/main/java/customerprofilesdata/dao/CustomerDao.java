package customerprofilesdata.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import customerprofilesdata.model.Customer;
import customerprofilesdata.model.CustomerDetails;

@Component
public class CustomerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	// Create user data
	@Transactional
	public void createCustomer(Customer customer) {
		this.hibernateTemplate.saveOrUpdate(customer);
	}
	
	// Getting all users
	public List<Customer> getCustomers(){
		List<Customer> customers=this.hibernateTemplate.loadAll(Customer.class);
		return customers;
		
	}
	
	//delete Single customer
	@Transactional
	public void deleteCustomer(int cid) {
		Customer c=this.hibernateTemplate.load(Customer.class, cid);
		this.hibernateTemplate.delete(c);
	}
	
	// Get single user
	
	public Customer getCustomer(int cid) {
		return this.hibernateTemplate.get(Customer.class, cid);
	}
	
}
