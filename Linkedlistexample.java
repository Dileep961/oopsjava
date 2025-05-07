package com.oops;

import java.util.ArrayList;

public class Linkedlistexample {

	public static void main(String[] args) {

		ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

		// Adding multiple lists to the main list
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cherry");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Dog");
		list2.add("Elephant");
		list2.add("Fox");

		ArrayList<String> list3 = new ArrayList<>();
		list3.add("Guitar");
		list3.add("Harmonica");
		list3.add("Violin");

		// Adding all sub-lists to the main list
		listOfLists.add(list1);
		listOfLists.add(list2);
		listOfLists.add(list3);

		// Printing the List of Lists
		System.out.println("List of Lists:");
		for (ArrayList<String> subList : listOfLists) {
			System.out.println(subList);
		}
	}
}
