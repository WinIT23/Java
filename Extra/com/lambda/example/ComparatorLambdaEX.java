package com.lambda.example;

import java.util.Comparator;

public class ComparatorLambdaEX {
    public static void main(String[] args) {
     
        Comparator<String> c1 = (String a, String b) -> a.compareTo(b);
        Comparator<String> c2 = (a, b)-> a.compareTo(b);
        
        System.out.println("Output : " + c1.compare("Hello", "Hello"));
        System.out.println("Output : " + c2.compare("Hello", "Hello"));
    }
}