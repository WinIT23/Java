package com.lambda.example;

public class TestableDemo {
    public static Testable a = (d) -> {
        System.out.println("Sum : " + (Testable.number + d));
    };

    public static void main(String[] args) {
        new Thread(() -> a.add(11)).start();
    }
}