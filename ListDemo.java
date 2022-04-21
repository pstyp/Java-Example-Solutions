package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<>(); 
		
		names.add("Zayn");
		names.add("Tom");
		names.add("Angelica");
		names.add("Pete");
		names.add("George");
		
		System.out.println(names);
//		System.out.println(names.get(2));
//		
//		names.set(0, "Aswene");
//		
//		System.out.println(names);
//		names.remove(4);
//		System.out.println(names);
		
//		Collections.sort(names);
//		System.out.println(names);
//		
//		System.out.println(names.size());
//		
//		// FOR LOOP
//		for (int i=0; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
//		
//		// ENHANCED FOR LOOP
//		for (String name : names) {
//			System.out.println(name);
//		}
//		
		Collections.swap(names, 0, 4);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		List<String> names2 = List.of("James", "George", "Bob");
		System.out.println(names2);
		
	}
	
}
