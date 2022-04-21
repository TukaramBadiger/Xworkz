package com.xworkz.serialize;

import java.io.*;


public class serialize {
	
	
public static void main(String [] args) throws IOException {
	serielization serl=new serielization();
	serl.name="bhim";
	serl.age=20;
	



FileOutputStream file;
try {
	file = new FileOutputStream ("C:\\Users\\Tukaram\\OneDrive\\Desktop\\java.txt");
	ObjectOutputStream out =new ObjectOutputStream(file);

	
	
	
	
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



}	

}
