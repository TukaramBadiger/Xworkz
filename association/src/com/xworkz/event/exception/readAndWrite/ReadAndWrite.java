package com.xworkz.exception.readAndWrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {
	
	public static void main(String [] args) throws IOException  {
		
		FileWriter writer=new FileWriter("C:\\Users\\Tukaram\\OneDrive\\Desktop\\file.txt");
		writer.write("manju");
		writer.close();
		
		
		
		FileReader fileread=new FileReader("C:\\Users\\Tukaram\\OneDrive\\Desktop\\file.txt");
		char[] ref=new char[500];
		fileread.read(ref);
		System.out.println(ref);
		fileread.close();
	}

}