package com.xworkz.association.hotel;

import com.xworkz.association.VendorType;

public class Vendor {
	private VendorType vendorType;
	private double billPrice;
	private String name;
	
	public  Vendor(VendorType vendorType, double billPrice, String name) {
		super();
		this.vendorType = vendorType;
		this.billPrice = billPrice;
		this.name = name;
	}
	
	public boolean sell() {
		System.out.println("invoked sell");
		if(this.billPrice>1000) {
			return true;
		}
		return false;
		
	}
	public double getBillPrice() {
		return billPrice;
	}
	public VendorType getVendorType() {
		return vendorType;
	}
	public String getName() {
		return name;
	}
	}

