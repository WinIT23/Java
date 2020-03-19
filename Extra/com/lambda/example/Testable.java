package com.lambda.example;

@FunctionalInterface
public interface Testable {
    static int number = 100;

    void add(int x);
    
    static void setNumber() {
        System.out.println("Nothing in static");
    }

    default void printNumber() {
        System.out.println("Number : " + number);
    }
}