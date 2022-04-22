package collection.com.xworkz.collection.car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CarBrandRunner {

	public static void main(String [] args) {
		
		Collection<String> collection=new ArrayList<>();
		collection.add("Audi");
		collection.add("Skoda");
		collection.add("porshe");
		collection.add("hundai");
		collection.add("bugati");
		collection.add("lamborgini");
		collection.add("jaguar");
		collection.add("Ferrari");
		collection.add("maruti 800");
		collection.add("nissan");
		collection.add("range Rover");
		collection.add("Rolls Roys");
		collection.add("Telsa");
		collection.add("Swift");
		collection.add("Toyota");
		
		
		
		int totalElements=collection.size();
		System.out.println(totalElements);
		
		
		boolean present= collection.contains("Fererari");
		System.out.println(present);
		
		
		
		Iterator<String> iterator=collection.iterator();
		
	
while(iterator.hasNext()) {
	String element1=iterator.next();
	System.out.println(element1);
}

}
}