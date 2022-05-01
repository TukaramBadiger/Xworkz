package collection.com.xworkz.FoodItem.Runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;import java.util.stream.Collector;
import java.util.stream.Collectors;

import collection.com.xworkz.FoodItem.dto.FoodItemDTO;
import collection.com.xworkz.FoodItem.dto.constant.FoodType;
import collection.com.xworkz.FoodItem.dto.constant.Quantity;

public class FoodTypeRunner {
	public static void main(String[] args) {
		
		
		FoodItemDTO dto=new FoodItemDTO(01, "fishCurry", Quantity.FULL,250,FoodType.NON_VEG,"Second Wilf" );
		FoodItemDTO dto1=new FoodItemDTO(02, "Barbique", Quantity.FULL,700,FoodType.BOTH,"Absolute Barbique" );
		FoodItemDTO dto2=new FoodItemDTO(03, "Hanumantu palav", Quantity.FULL,350,FoodType.NON_VEG,"Hanumantu Hotel" );
		FoodItemDTO dto3=new FoodItemDTO(04, "Chicken Biryani", Quantity.HALF,500,FoodType.NON_VEG,"Meghanas" );
		FoodItemDTO dto4=new FoodItemDTO(05, "Kaju Kolhapuri", Quantity.FULL,300,FoodType.VEG,"Shabari Sagar" );
		FoodItemDTO dto5=new FoodItemDTO(06, "Chicken Grill", Quantity.FULL,400,FoodType.NON_VEG,"Meghanas" );
		FoodItemDTO dto6=new FoodItemDTO(07, "Masala Dose", Quantity.FULL,95,FoodType.VEG,"Vidyarthi Bhavan" );
		FoodItemDTO dto7=new FoodItemDTO(14, "Biryani", Quantity.FULL,350,FoodType.NON_VEG,"Niyaz" );
		FoodItemDTO dto8=new FoodItemDTO(18, "Mallige Idli", Quantity.FULL,250,FoodType.VEG,"Tent House" );
		FoodItemDTO dto9=new FoodItemDTO(15, "Mutten Biryani", Quantity.FULL,500,FoodType.NON_VEG,"Military Hotel" );
		FoodItemDTO dto10=new FoodItemDTO(11, "fishfry", Quantity.HALF,200,FoodType.NON_VEG,"Hotel Fish" );
		FoodItemDTO dto11=new FoodItemDTO(12, "chicken tikka", Quantity.HALF,300,FoodType.NON_VEG,"The Park" );
		FoodItemDTO dto12=new FoodItemDTO(13, "Chicken 65", Quantity.HALF,250,FoodType.NON_VEG,"Hotel Samrat" );
		
		List<FoodItemDTO> list=new LinkedList<FoodItemDTO>();
		
		list.add(dto12);
		list.add(dto11);
		list.add(dto10);
		list.add(dto9);
		list.add(dto8);
		list.add(dto7);
		list.add(dto6);
		list.add(dto5);
		list.add(dto4);
		list.add(dto3);
		list.add(dto2);
		list.add(dto1);
		

	System.out.println("loop all items & display");
	list.stream().collect(Collectors.toList()).forEach(display->System.out.println(display));

	    System.out.println("  ");

	    System.out.println("loop and filter by non-veg and display");
	    list.stream().filter(nonveg->nonveg.getType()==FoodType.NON_VEG).collect(Collectors.toList()).forEach(type->System.out.println(type));
			
		System.out.println("");
		
		System.out.println("price is greater than 250");
		list.stream().filter(price->price.getPrice()>=300).collect(Collectors.toList()).forEach(price->System.out.println(price));
		System.out.println(" ");
		
		System.out.println("price is greater than 250 get only hotel names ");
		list.stream().filter(price->price.getPrice()>=300).map(hotelName->hotelName.getHotelName()).collect(Collectors.toList()).forEach(price->System.out.println(price));
        System.out.println(" ");
        
      System.out.println(" get name sorted");
      list.stream().map(name->name.getName()).sorted().collect(Collectors.toList()).forEach(name->System.out.println(name));
      System.out.println(" ");
		
      
      System.out.println("loop and get only ids sorted in descending");
      list.stream().map(id->id.getID()).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(rid->System.out.println(rid));
      System.out.println("");
      
      System.out.println("loop and get name where hotel name");
      list.stream().map(name->name.getHotelName()).collect(Collectors.toList()).forEach(hName->System.out.println(hName));
      System.out.println(" ");
      
      System.out.println("loop and filter by veg type and sort by desc");
      list.stream().filter(veg->veg.getType()==FoodType.VEG).map(veg->veg.getType()).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(veg->System.out.println(veg) );
      System.out.println(" ");
      
      System.out.println("loop and sortr");
      list.stream().map(price->price.getPrice()).sorted().collect(Collectors.toList()).forEach(sort->System.out.println(sort));
      System.out.println("");
      
      System.out.println(" looop and decending sort");
      list.stream().map(descPrice->descPrice.getPrice()).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(descprice->System.out.println(descprice));
      System.out.println("");
      
      System.out.println("get name in upper case");
      list.stream().map(Name->Name.getName().toUpperCase()).collect(Collectors.toList()).forEach(upperCaseName->System.out.println(upperCaseName));
      System.out.println("");
      
      System.out.println("Hotel name in upper case");
      list.stream().map(Name->Name.getHotelName()).collect(Collectors.toList()).forEach(UpperName->System.out.println(UpperName));
      
      
      

	}

}