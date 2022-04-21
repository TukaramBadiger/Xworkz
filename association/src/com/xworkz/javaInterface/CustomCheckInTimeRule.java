package com.xworkz.javaInterface;

public interface CustomCheckInTimeRule {

	
	double minCheckInTime();
	
	
	default double maxCheckInTime() {
		System.out.println("max checkin time");
		return 7.30;
		
	}

	
	
}
