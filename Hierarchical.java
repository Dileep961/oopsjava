package com.oops;

public class Hierarchical {

	public static void main(String[] args) {
		
        B obj = new B();
        obj.Fruits();
        obj.Banana();

        C obj1= new C();
        obj1.Fruits();
        obj1 .Orange();

	}

}
class A {
    void Fruits() {
        System.out.println("the fruits are....");
    }
}

class B extends A {
    void Banana() {
        System.out.println("Banana.");
    }
}

class C extends A {
    void Orange() {
        System.out.println("Orange");
    }
}