package com.driver;

// Task 1 & 2 & 4 done together
class A {
    // Task 1: Method in class A
    String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Class B extends A
class B extends A {
    // Task 4: Overriding meth() in class B
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

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