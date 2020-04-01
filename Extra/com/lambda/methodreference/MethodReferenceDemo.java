package com.lambda.methodreference;

import java.util.Comparator;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        System.out.println("Answer : " + MethodReferenceDemo.compare(11, 22));

        // ClassName :: methodName 
        Comparator<Integer> comp =  MethodReferenceDemo :: compare;
        System.out.println("Answer : " + comp.compare(11, 22));
    }

    public static int compare(Integer x, Integer y) {
        return Integer.compare(x, y);
    }
}