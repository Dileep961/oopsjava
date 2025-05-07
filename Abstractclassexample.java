package com.oops;

abstract class Hotel{
	abstract void food();
	abstract void smartphone();
	void output() {
		
	}
}

class veghotel extends Hotel{

	@Override
	void food() {
		System.out.println("this is very yummy");
		
	}

	@Override
	void smartphone() {
		System.out.println("the smartphone is very good");
		
	}
	
}
class nonveghotel extends Hotel{

	@Override
	void food() {
		System.out.println("this is very yummy");
		
	}

	@Override
	void smartphone() {
		System.out.println("the smartphone is very good");
		
	}
	
}

public class Abstractclassexample {

	public static void main(String[] args) {
		veghotel jj = new veghotel();
		jj.food();
		
		nonveghotel ll = new nonveghotel();
		ll.smartphone();
	}

}
