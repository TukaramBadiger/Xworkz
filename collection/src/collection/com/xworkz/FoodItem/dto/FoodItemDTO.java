package collection.com.xworkz.FoodItem.dto;

import java.io.Serializable;

import collection.com.xworkz.FoodItem.dto.constant.FoodType;
import collection.com.xworkz.FoodItem.dto.constant.Quantity;

public class FoodItemDTO implements Serializable {
	private int ID;
	private String name;
	private Quantity quantity;
	private double price;
	private FoodType type;
	private String hotelName;
	
	
	
	
	


	public FoodItemDTO(int iD, String name, Quantity quantity, double price, FoodType type, String hotelName) {
		super();
		ID = iD;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.type = type;
		this.hotelName = hotelName;
		

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItemDTO other = (FoodItemDTO) obj;
		if (ID != other.ID)
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FoodItemDTO [ID=" + ID + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", type="
				+ type + ", hotelName=" + hotelName + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Quantity getQuantity() {
		return quantity;
	}
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public FoodType getType() {
		return type;
	}
	public void setType(FoodType type) {
		this.type = type;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	

}
