package com.xworkz.event.exception.readAndWrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {
	
	public static void main(String [] args) throws IOException   {
		
		
		Scanner scanner=new Scanner(System.in);		
	    scanner.hasNextLine();
		
		FileWriter writer=new FileWriter("C:\\Users\\Tukaram\\OneDrive\\Desktop\\file.txt");
		writer.write("good night");
		writer.close();
		
		
		
		FileReader fileread=new FileReader("C:\\Users\\Tukaram\\OneDrive\\Desktop\\file.txt");
		char[] ref=new char[500];
		fileread.read(ref);
		System.out.println(ref);
		fileread.close();
	}

}
