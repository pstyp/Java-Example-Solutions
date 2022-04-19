package com.qa.demo;

public class Conditionals {

	public static void main(String[] args) {

		conditionalExample(16);
	}

	private static void conditionalExample(int num) {
	
	// IF NUM IS LOWER THAN 15 AND NOT EQUAL TO 0 PRINT HELLO 
	// IF ITS BETWEEN 15 and 20 PRINT BYE 
	// ELSE PRINT NUM
	
	if (num< 15 && num!=0) {
		System.out.println("Hello");
		
	} else if (num < 20) {
		System.out.println("Bye");
	}
	else {
		System.out.println(num);
	}
		
		
	}

	private static void canPawelJava() {

	boolean canPawelJava=true;
		if (canPawelJava) {
			System.out.println("Pawel can Java");
		} else {
			System.out.println("Pawel can't Java");
		}

	}
	public static void numbersJava() {
		int num = 19;
		
		if (num <= 20) {
			System.out.println("Number is less than or equal to 20");
		} else if (num < 40 ) {
			System.out.println("Number is between 20 and 40");
		} else {
			System.out.println("Number is greater than or equal to 40");
		}
	}
	
	public static void switchCase() {
		int num = 2;
		
		switch (num) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		default:
			System.out.println("This is the default option");
			break;
		}
	}
	
	
}
