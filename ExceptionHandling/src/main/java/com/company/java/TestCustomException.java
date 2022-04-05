package com.company.java;

import java.util.Scanner;

public class TestCustomException {

	public static void main(String args[]) {
		try {
			validateAge(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter something: ");
			int input = sc.nextInt();
		
			validateInput(input);
			sc.close();
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("rest of the code...");
	}

	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("not valid");
		} else {
			System.out.println("welcome to vote");
		}
	}
	
	static void validateInput(int input) throws IllegalInputException {
		if (input < 0) {
			throw new IllegalInputException("not valid");
		} else {
			System.out.println("input validated");
		}
	}

}
