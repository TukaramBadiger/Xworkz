package collection.com.xworkz.collection.washingMachine.dto;

import collection.com.xworkz.collection.washingMachine.constants.WashingMachineType;

public class WashingMachineDTO {
	
	private int id;
	private String brand;
	private String capacity;
	private String color;
	private WashingMachineType type;
	private double price;
	private int modelNo;
	
	
	public WashingMachineDTO(int id, String brand, String capacity, String color, WashingMachineType type,
			double price, int modelNo) {
		super();
		this.id = id;
		this.brand = brand;
		this.capacity = capacity;
		this.color = color;
		this.type = type;
		this.price = price;
		this.modelNo = modelNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public WashingMachineType getType() {
		return type;
	}
	public void setType(WashingMachineType type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	
	
	@Override
	public String toString() {
		return "WashingMachineDTO [id=" + id + ", brand=" + brand + ", capacity=" + capacity + ", color=" + color
				+ ", type=" + type + ", price=" + price + ", modelNo=" + modelNo + "]";
	}
}
