package customerprofilesdata.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails { 
    
	@Id
	private int id;
	private String email;
	private String number;
	
	@OneToOne(mappedBy="customerDetail")
	private Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerDetails() {
	}
	
	public CustomerDetails(int id, String email, String number) {
		super();
		this.id = id;
		this.email = email;
		this.number = number;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Customer_Details [id=" + id + ", email=" + email + ", number=" + number + "]";
	}
	
	
}
