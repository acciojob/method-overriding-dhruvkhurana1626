package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create object of class B and call method meth of class A with it
        B obj = new B();

        // If we want to call method of class A (not overridden one)
        System.out.println(((A) obj).meth());  // This will still call overridden version in Java

        // Task 5: Call overridden method
        System.out.println(obj.meth());
    }
}