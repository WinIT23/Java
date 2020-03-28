package com.thread.example;

import java.util.ArrayList;
import java.util.List;

public class AddThreadDemo {
    public static double test() {
        long startTime = System.nanoTime();

        AddThread tObj = new AddThread(13, Integer.MAX_VALUE);
        tObj.calculate();

        double elapsedTime = (System.nanoTime() - startTime)/1000000;
     
        System.out.println("Total execution time in milis: " + elapsedTime);
        return elapsedTime;
    }

    public static void main(String[] args) {

        int test = Integer.parseInt(args[0]);
        List<Double> times = new ArrayList<>();

        for(int i = 0; i < test; i++) {
            times.add(AddThreadDemo.test());
        }

        double avgTime = times.stream().filter(i -> true).mapToDouble(i -> i).sum() / test;
        
        System.out.println("Average time : " + avgTime);
    } 
}