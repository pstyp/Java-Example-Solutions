package com.qa.demo;

public class Person {

	
	//ATTRIBUTES
	private String name;
	private int age;
	private double shoesize;
	
	// CONSTRUCTOR
	public Person(String name, int age, double shoesize) {
		this.name = name;
		this.age = age;
		this.shoesize = shoesize;
	}
    //OVERLOADING
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

// NON-STATIC METHOD
	public void greet() {
		System.out.println("Hi I'm "+ name+ " and I'm " +age + " years old. My shoe size is " + shoesize);
	}
// STATIC METHOD
	public static void hello() {
		System.out.println("hello");
	}
}
