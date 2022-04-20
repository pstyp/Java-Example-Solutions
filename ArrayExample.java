package com.qa.demo;

public class ArrayExample {

	public static void main(String[] args) {

		// ARRAYS
		int[] ageArray = { 18, 26, 100, 12, 6, 5 };
		long[] ageArray2 = new long[6];
		String[] nameArray = { "John", "Emma", "Alex", "Rachel", "Sean" };

		ageArray2[0] = 100;
		ageArray2[1] = 50;
		ageArray2[3] = 3;

//		ageArray[0] = 5;

		// FOR LOOP

		for (int i = ageArray.length-1; i>=0; i--) {
			System.out.println(ageArray[i]);
		}
		// FOR-EACH LOOPS (enhanced for loops)

//		for (String name : nameArray) {
//			System.out.println(name);
//		}
//		for (int age : ageArray) {
//			System.out.println(age);
//		}
	}

}
