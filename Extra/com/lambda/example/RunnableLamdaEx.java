package com.lambda.example;

public class RunnableLamdaEx {
    public static void main(String[] args) {
        // Before
        Runnable t1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread Before");
            }
        };
        new Thread(t1).start();

        // After
        Runnable t2 = () -> {
            System.out.println("Thread Lamda");
        };
        new Thread(t2).start();

        new Thread(() -> {
            System.out.println("Thread Lamda Compact");
        }).start();
    }
}