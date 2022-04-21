package com.xworkz.javaInterface;

public interface CustomRule {

	
	boolean validPassport();
	
	
	default boolean baggageCheckin() {
		System.out.println("checking baggage");
		return true;
	}
	
	String bookedTickets();
	
	
}
