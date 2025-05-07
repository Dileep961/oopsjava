package com.oops;

public class Constructor {

	public static void main(String[] args) {
		construct ex = new construct(10);
		System.out.println("the area value is ..."+ex.area());
		
		construct ex1=new construct(30,20);
		System.out.println("the area value is ..."+ex1.area());

}

}
class construct {
	float length ,breadth;
	public void construct() {
		this.length = 10;
		this.breadth= 9;
	}
	public construct(float x,float y) {
		this.length=x;
		this.breadth=y;
	}
	construct(float x){
		length=breadth=x;
	}
	float area() {
		return breadth*length;
	}
}