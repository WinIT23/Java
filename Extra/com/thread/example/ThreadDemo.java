package com.thread.example;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    public static final long VAL = 10;

    public static void main(String[] args) {
        List<Long> ans = new ArrayList<>();
        new Thread(() -> {

            for(long i = 1; i <= ThreadDemo.VAL; i++) {
                ans.add(i);
            }

            long x = ans.stream().filter(i -> true).mapToLong(i -> i).sum();

            System.out.println("X : "+ x);

            System.out.println((x == ThreadDemo.VAL)?"true": "false");
        }).start();

        System.out.println("ThreadDemo.VAL : " + ThreadDemo.VAL);

    }
}