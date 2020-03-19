package com.lambda.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
    
    Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};
    con1.accept("Hello");
    
    Consumer<String> cons = (s) -> {
        System.out.println(s.toUpperCase());
    };
    cons.andThen(con1).accept("Java");
    }
}
