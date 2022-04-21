package com.xworkz.javaInterface;

public class CustomRuleImplementor implements CustomRule,CustomCheckInTimeRule,CustomGoodsRule {

	

	@Override
	public String[] nonValidItems() {
		System.out.println("non valid items");
		return null;
	}

	@Override
	public double minCheckInTime() {
	    System.out.println("min check in time ");
		return 6.30;
	}

	@Override
	public boolean validPassport() {
		System.err.println("passport is valid");
		return true;
	}

	@Override
	public String bookedTickets() {
	    System.out.println("ticket is booked");
		return "Booked";
	}

}