package com.xworkz.clone;

public class DeepCloning implements CloneAble  {
	int a;
	int b;
	
	
	
	
	public DeepCloning(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}




	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	

		
	
	

}
