package com.lambda.methodreference;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.lambda.repo.Person;
import com.lambda.repo.PersonRepository;

public class MethodRefLambdaDemo {

    // ClassName :: methodName;
    
    static Function<String, String> func1 = name -> name.toUpperCase();
    static Function<String, String> func2 = String::toUpperCase;

    static Predicate<Person> pre1 = person -> person.getHeight() >= 140;
    static Predicate<Person> pre2 = MethodRefLambdaDemo::heightCheck;

    static BiPredicate<Person, Integer> pre3 = MethodRefLambdaDemo::heightCheck;

    static Supplier<Person> pSup = PersonRepository::getPerson;

    public static void main(String[] args) {
        System.out.println("Lambda Ex : " + func1.apply("Vinit"));
        System.out.println("Lambda Ex : " + func2.apply("Vinit"));

        System.out.println("Height Check : " + pre1.test(pSup.get()));
        System.out.println("Height Check : " + pre2.test(pSup.get()));

        System.out.println("Height Check : " + pre3.test(pSup.get(), 500));
    }

    static boolean heightCheck(Person per) {
        return per.getHeight() >= 140;
    }

    static boolean heightCheck(Person per, Integer height) {
        return per.getHeight() >= height;
    }
}