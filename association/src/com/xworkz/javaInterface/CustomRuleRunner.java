package com.xworkz.javaInterface;

public class CustomRuleRunner {
	public static void main(String[] args) {
		
		CustomRuleImplementor impl=new CustomRuleImplementor();

		CustomCheckInTimeRule rule=(CustomCheckInTimeRule)impl;
		impl.baggageCheckin();
		impl.bookedTickets();
		impl.maxCheckInTime();
		impl.minCheckInTime();
		impl.validItems();
		impl.nonValidItems();
		impl.validPassport();
		rule.maxCheckInTime();
	
	}

}
