package com.xworkz.clone;

public class ShallowClone {
	
	
	
	
	public static void main(String [] args) {
		DeepCloning shallow=new DeepCloning(8,5);
		try {
			//DeepCloning shallow=new DeepCloning(8,5);
			DeepCloning shallow1=(DeepCloning)shallow.clone();
			
			System.out.println(shallow.a+""+shallow.b);
			System.out.println(shallow1.a+""+shallow.b);
			
			
		} catch (CloneNotSupportedException e) {
			
			
			
			
			e.printStackTrace();
		}
	
		
	}
	

}
