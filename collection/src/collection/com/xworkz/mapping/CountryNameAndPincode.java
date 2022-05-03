package collection.com.xworkz.mapping;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryNameAndPincode {
	public static void main(String [] args) {
		Map<String, String> countryNameandpicodeMap=new HashMap<>();
		countryNameandpicodeMap.put("India", "15216");
		countryNameandpicodeMap.put("China", "1700000");		
		countryNameandpicodeMap.put("Belgium", "3386");
		countryNameandpicodeMap.put("France", "52727");
		countryNameandpicodeMap.put("Japan", "94378");
		countryNameandpicodeMap.put("Malaysia", "2818");
		countryNameandpicodeMap.put("Mexico", "75203");
		countryNameandpicodeMap.put("Australia", "16648");
		countryNameandpicodeMap.put("Austria", "46375");
		countryNameandpicodeMap.put("Brazil", "224984");
		countryNameandpicodeMap.put("Canada", "765344");
		countryNameandpicodeMap.put("Argentina", "20260");
		
		
		System.out.println("Total Country name and pin "+countryNameandpicodeMap.size());
		
		System.out.println("   ");

		System.out.println("countries Name");
		Set<String> keys=countryNameandpicodeMap.keySet();
		keys.forEach(name->System.out.println(name));
		
		System.out.println("   ");
		System.out.println("pincode of countries");
		Collection<String> values=countryNameandpicodeMap.values();
		values.forEach(pin->System.out.println(pin));
		
		System.out.println("   ");
		System.out.println("read name and pin of a country using entry");
		Set<Entry<String,String>> read=countryNameandpicodeMap.entrySet();
        read.forEach(nameAndPin->System.out.println(nameAndPin));
        
		System.out.println("   ");
        System.out.println("read keys");
        countryNameandpicodeMap.forEach((country,Pin)->System.out.println(country+" "+Pin));
        
        
        
        
        
        
        }
        
		
		
		
		
		
		
		
		
		
	}

