package com.company.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamExample {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fin = new FileInputStream("/Users/aditithakkar/Documents/workspace/Simple/0.txt");
			int i = fin.read();
			System.out.print((char)i);
			
			fin.close();
		} catch(Exception e) {
			System.out.println(e);
		}
//		catch(IOException e) {
//			System.out.println("File not found!");
//		}
	}

}
