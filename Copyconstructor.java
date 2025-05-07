package com.oops;

public class Copyconstructor {

	public static void main(String[] args) {
		
        Person s1 = new Person("Dileep", 24); 
        System.out.println("Name: " + s1.name + ", Age: " + s1.age);
        
        Person s2 = new Person(s1);
        System.out.println("Name: " + s2.name + ", Age: " + s2.age);


	}

}
class Person {
    String name;
    int age;

   public Person(String name, int age) {
        this.name = name;
        this.age = age;
   }
   public Person(Person another) {
        this.name = another.name;
        this.age = another.age;
    }
}
