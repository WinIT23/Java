package com.lambda.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    
    static BiConsumer<Integer, Integer> b1 = (a,b) -> {
        System.out.println("a : " + a + " b : " + b);
    };
    public static void main(String[] args) {
        b1.accept(11, 22);
    }
}