package com.oops;

public class Polymorphism {
public static void main(String[] args) {
	System.out.println("the hotel star is .."+methodoverloexample.hotel);
	
	
}
}



class methodoverloexample {
	 
	public static String hotel;

	public static int hotel(int a, int b) {
 
		return a * b;
 
	}
 
	public static double hotel(double x, double y) {
 
		return x * y;
 
	}
 
	public static double hotel(double i, int j) {
 
		return i - j;
 
	}
 
	public static int hotel(int r) {
 
		return r * r;
 
	}
 
}