package com.thread.example;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface SumChunk {
    void run(long startRange, long endRange);
}

@FunctionalInterface
interface SumThreads {
    long run();
}

public class AddThread {

    public static final int THREAD_COUNT = 8;

    private long sum;
    private long sumTill = Integer.MAX_VALUE;
    private List<Long> answers = new ArrayList<>();

    private SumThreads tRun = () -> {
        // Adds the answers of all threads.
        long[] x = new long[1];
        x[0] = answers.stream().filter(i -> true).mapToLong(i -> i).sum();
        System.out.println(this.answers);
        return x[0];
    };

    private SumChunk sRun = (s, e) -> {
        // adds the part of the range.
        new Thread(() -> {
            long tSum = 0;
            for (long i = s; i < e; i++) {
                tSum += i;
            }
            answers.add(tSum);
            System.out.println("tSum : " + tSum 
                            + " aList : " + answers.get(answers.size() - 1));
        }).start();
    };

    private long divideTask(long perThread) {
        for (int i = 0; i < AddThread.THREAD_COUNT; i++) {
            sRun.run(perThread * i, (perThread * (i + 1)) - 1);
            // System.out.println(i + " : " + perThread*i);
        }
        System.out.println(answers);
        return tRun.run();
    }

    public void calculate() {
        long perThread = sumTill / AddThread.THREAD_COUNT;
        sum = this.divideTask(perThread);
        System.out.println("Sum is : " + sum);
    }
}