package com.xworkz.association.hotel;

public class Hotel {
	private String name="Shabari sagara";
   private int since;
   private Vendor vendor;
   
   
public Hotel(Vendor vendor) {

	this.vendor = vendor;
}
public void buyVegetables() {
	System.out.println("invoked vegetables");
	if(this.name!=null) {
		String hotelName=this.name.toUpperCase();
		System.out.println(hotelName);
	}
	
	
	if(vendor!=null)
{
		boolean sold =this.vendor.sell();
		if(sold) {
		 System.out.println("can buy vegetables");
		 System.out.println(this.vendor.getBillPrice());
		 System.out.println(this.vendor.getName());
		 System.out.println(this.vendor.getVendorType());
		 
		}
		else {
			System.out.println("cant buy vegetable");
		}
}
	
}
		public void setSince(int since) {
			this.since=since;
			
		}
		public void setName(String name) {
	     this.name=name;
		}
}
  

