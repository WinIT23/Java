package com.thread.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@FunctionalInterface
interface SumChunk {
    long run(long startRange, long endRange);
}

@FunctionalInterface
interface SumThreads {
    long run();
}

public class AddThread {

    public static int THREAD_COUNT = 4;
    public static long sumTill = 10;

    private long sum;
    private List<Long> answers = new ArrayList<>();

    AddThread() {
        this(4, 10);
        System.out.println("using default values (4, 10)");
    }

    AddThread(int threadCount, long endRange) {
        AddThread.THREAD_COUNT = threadCount;
        AddThread.sumTill = endRange;
    }

    private SumThreads tRun = () -> {
        // Adds the answers of all threads.
        long[] x = new long[1];
        x[0] = answers.stream().filter(i -> true).mapToLong(i -> i).sum();
        return x[0];
    };

    private SumChunk sRun = (s, e) -> {
        // adds the part of the range.
        // new Thread(() -> {
        Callable callable = () -> {
            long tSum = 0;
            for (long i = s; i <= e; i++) {
                tSum += i;
            }
            // System.out.println("S : " + s + " tSum : " + tSum
            // + " aList : " + answers.get(answers.size() - 1));
            return tSum;
        };
        try {
            return (Long) callable.call();
        } catch (Exception ex) {
            System.out.println("Exception at sRun");
            ex.printStackTrace();
            return 0;
        }
        // }).start();
    };

    private long divideTask(long perThread) {
        for (int i = 0; i < AddThread.THREAD_COUNT; i++) {
            long s = perThread * i,
                    e = (i == AddThread.THREAD_COUNT - 1) ? AddThread.sumTill : (perThread * (i + 1)) - 1;

            long tSum = sRun.run(s, e);
            // System.out.println(i + " : " + s + "\t" + e + "\t" + tSum);
            answers.add(tSum);
        }
        //System.out.println(answers);
        return tRun.run();
    }

    public long calculate() {
        long perThread = AddThread.sumTill / AddThread.THREAD_COUNT;
        this.sum = this.divideTask(perThread);
        return this.sum;
        // System.out.println("Sum is : " + sum);
    }
}