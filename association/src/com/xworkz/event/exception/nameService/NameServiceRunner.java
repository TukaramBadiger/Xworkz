package com.xworkz.event.exception.nameService;
import com.xworkz.event.exception.nameService.NamesService;

public class NameServiceRunner {

	public static void main(String[] args) throws InValidNamesException {
NamesService nameService=new NamesService();
try {
	nameService.add("ram");
	nameService.add("bhim");
	nameService.add("pk");
	nameService.add("suyog");
	nameService.add("-mani");
} catch (InValidNamesException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
		
		
		
		
		
	}


