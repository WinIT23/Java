package com.thread.example;

import java.util.ArrayList;
import java.util.List;

public class AddThreadDemo {
    
    private static int test;
    private static int threadCount;

    public static double test() {
        long startTime = System.nanoTime();

        AddThread tObj = new AddThread(threadCount, Long.MAX_VALUE);
        tObj.calculate();

        double elapsedTime = (System.nanoTime() - startTime)/1000000;
     
        System.out.println("Total execution time in milis: " + elapsedTime);
        return elapsedTime;
    }

    public static void main(String[] args) {

        try {
            test = Integer.parseInt(args[0]);
            threadCount = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Number of arguments...");
            System.out.println("Argument-1 : Number of Test");
            System.out.println("Argument-2 : Number of Threads");
            System.exit(0);
        }

        List<Double> times = new ArrayList<>();

        for(int i = 0; i < test; i++) {
            times.add(AddThreadDemo.test());
        }

        double avgTime = times.stream().filter(i -> true).mapToDouble(i -> i).sum() / test;
        
        System.out.println("Average time : " + avgTime);
    } 
}