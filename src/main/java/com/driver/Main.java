package com.driver;

// Task 3: Create the main function in Main.java
public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class RWOnly in this file
        RWOnly obj = new RWOnly();

        // Task 4: Try setting a value to name directly and also try printing it
        // Error: You might see some error, please note it down in comments
        // obj.name = "Direct Access"; // This line will result in a compilation error

        // Task 5 and Task 6: Try using getter and setter functions
        // Set a value to name using setter function
        obj.setName("Set using Setter");

        // Access the value using getter function and print it
        System.out.println( obj.getName());
    }
}
