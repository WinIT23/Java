package com.lambda.variables;

import java.util.function.Consumer;

public class VariableLambdaDemo {
    
    static int k = 10; // Class Level Variable is modifiable in Lambdas.
    public static void main(String[] args) {
        int i = 100; // Local Variable is readable only in Lambdas.
        
        Consumer<Integer> c1 = (j) -> {
            // i++;
            k = 25;
            System.out.println("k : " + k);
            System.out.println("i : " + i);
        };
        
        c1.accept(11);
    }
}