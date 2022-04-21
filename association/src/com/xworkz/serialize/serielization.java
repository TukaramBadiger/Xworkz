package com.xworkz.serialize;

import java.io.Serializable;
import java.math.BigDecimal;

public class serielization implements Serializable  {
	
	public String name;
	public int age;
	//private BigDecimal data;
	
	public serielization() {
		
	}
	
	
	public serielization(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	//	this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public BigDecimal getData() {
		return data;
	}
	public void setData(BigDecimal data) {
		this.data = data;
	}*/

	
	
	

}
