package com.xworkz.event.exception;

public class DTO {
	
	public DTO() {
		System.out.println("DTO CONST CREAT");
	}
	
	
	private String name;
	private String place;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
