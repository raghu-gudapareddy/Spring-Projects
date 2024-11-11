package hotelmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sno;
	private String itemName;
	private String type;
	private int halfprice;
	private int fullprice;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int sno, String itemName, String type, int halfprice, int fullprice) {
		super();
		this.sno = sno;
		this.itemName = itemName;
		this.type = type;
		this.halfprice = halfprice;
		this.fullprice = fullprice;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHalfprice() {
		return halfprice;
	}

	public void setHalfprice(int halfprice) {
		this.halfprice = halfprice;
	}

	public int getFullprice() {
		return fullprice;
	}

	public void setFullprice(int fullprice) {
		this.fullprice = fullprice;
	}

	@Override
	public String toString() {
		return "Hotel [sno=" + sno + ", itemName=" + itemName + ", type=" + type + ", halfprice=" + halfprice
				+ ", fullprice=" + fullprice + "]";
	}
}
