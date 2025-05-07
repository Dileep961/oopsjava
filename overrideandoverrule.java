package com.oops;

public class overrideandoverrule {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition (2 args): " + calc.add(5, 10));
        System.out.println("Addition (3 args): " + calc.add(5, 10, 15));

        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Overridden Addition: " + advCalc.add(5, 10));
    }
}
class Calculator {
    // Function Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    // Function Overriding
    @Override
    int add(int a, int b) {
        System.out.println("Overridden method in AdvancedCalculator");
        return a + b + 10; // Adds an extra value
    }
}