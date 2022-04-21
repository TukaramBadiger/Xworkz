package com.xworkz.javaInterface;

public interface CustomGoodsRule {

	default String[] validItems() {
		String[] ref= {"dress","Mobile","laptop"};
		System.out.println("leagle items for carry");
		
		return ref;
		
	}
	
	String[] nonValidItems();
	
	
	
	
}
