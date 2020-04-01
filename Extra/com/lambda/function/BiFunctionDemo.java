package com.lambda.function;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    static BiFunction<String, String, Boolean> eq = (str1, str2) -> str1.equals(str2);
    static BiFunction<String, String, String> con = (str1, str2) -> str1.concat(" ").concat(str2);
    public static void main(String[] args) {
        System.out.println(eq.apply("Hi", "Hi"));
        System.out.println(con.apply("Hello", "World"));
    }
}