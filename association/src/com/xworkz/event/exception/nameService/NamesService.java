package com.xworkz.event.exception.nameService;

public class NamesService {

	private String[] names=new String[5];
	private int nameIndex=0;
	
	

	
	public NamesService() {
		super();
	}




	public boolean add(String name) throws InValidNamesException {
		
		if(name!=null) {
			if(name.length()>3 && name.length()<=5 && !name.matches("[A-Za-z]++")) {
				System.out.println("Name Is invalid"+name);
				throw new InValidNamesException();
				
			}
			else {
				System.out.println("Name is valid will be added into array"+name);
				if(nameIndex<name.length()) {
					this.names[this.nameIndex]=name;
					System.out.println("name Added is "+name);
					this.nameIndex++;
					return true;
				}
			}
		}
		
		return false;

	

	}

	
	
}
