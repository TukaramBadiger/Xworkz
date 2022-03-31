package com.xworkz.association;

import com.xworkz.association.hotel.Hotel;
import com.xworkz.association.hotel.Vendor;

public class HotelRunner {

	public static void main(String[] args) {
String vendorName="ram ";
Vendor vendor=new Vendor(VendorType.MILK,2500,vendorName);

Hotel hotel =new Hotel(vendor);
hotel.buyVegetables();
	}

}
