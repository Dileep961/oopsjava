package com.oops;

public class Methodoverriddingexp {

	public static void main(String[] args) {
		programmer p = new programmer("Dileep", 25, "Hyderabadi");
		p.display();
		
		user u = new user("Dileep",25);
		u.display();
	}
}

class user{
	String name;
	int age;
	
	user (String n, int a){
		this.name=n;
		this.age=a;
	}
	public void display() {
		System.out.println("Name.."+ name);
		System.out.println("age .."+ age);
	}
}

class programmer extends user{ //derived class or child class

	String biriyani;
	
	programmer(String n, int a , String c) {
		super(n, a);
		this.biriyani=c;

	}
	public void display() {
		System.out.println("Name.."+ name);
		System.out.println("age .."+ age);
		System.out.println("biriyani..."+biriyani);
	}
	
}