package com.xworkz.camera.dto;
/*CameraDTO --> id,brand,pixel,type,cost

CameraDAO--> abstract save(CameraDTO), abstract CameraDTO findById(int id), abstract CameraDTO findByMaxCost(), abstract CameraDTO findMinCost();

Id is always unique*/

import java.util.Objects;

public class CameraDTO {
	
	
	private int id;
	private String brand;
	private String pixel;
	private CameraType type;
	private double cost;
	
	public CameraDTO() {
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
	public String getPixel() {
		return pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}
	public CameraType getType() {
		return type;
	}
	public void setType(CameraType type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, cost, id, pixel, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CameraDTO other = (CameraDTO) obj;
		return Objects.equals(brand, other.brand)
				&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
				&& Objects.equals(pixel, other.pixel) && type == other.type;
	}

	}
	

