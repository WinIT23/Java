package com.lambda.function;

import java.util.function.Function;

public class FunctionDemo {
    
    static Function<String, String> func1 = name -> name.toUpperCase();
    static Function<String, String> func2 = name -> name.concat(" World");

    public static void main(String[] args) {
        System.out.println("Result : " + func1.apply("Hello"));
        System.out.println("AndThen Result : " + func1.andThen(func2).apply("Hello")); // func1 then func2
        System.out.println("Compose Result : " + func1.compose(func2).apply("Hello")); // func2 then func1
    }
}