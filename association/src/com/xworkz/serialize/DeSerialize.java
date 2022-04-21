package com.xworkz.serialize;

import java.io.*;

public class DeSerialize {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		serielization serial=null;
		
try {
	FileInputStream file=new FileInputStream("C:\\Users\\Tukaram\\OneDrive\\Desktop\\serial.txt");
	ObjectInputStream Ob=new ObjectInputStream(file);
	serial=(serielization)Ob.readObject();
	Ob.close();
	file.close();
	
	
} catch (FileNotFoundException e) {

	System.out.println("here deserilization");
	System.out.println("name"+serial.name+" "+"age "+serial.age);
	e.printStackTrace();
}

}
}
