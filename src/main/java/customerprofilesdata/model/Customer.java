package customerprofilesdata.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	private int id;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="costmerDetailsId")
	private CustomerDetails customerDetail;
	
	
	public Customer() {
	}


	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public CustomerDetails getCustomerDetail() {
		return customerDetail;
	}

	public void setCustomerDetail(CustomerDetails customerDetail) {
		this.customerDetail = customerDetail;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}
