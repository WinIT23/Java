package com.lambda.bookexample;

import java.util.List;
import java.util.ArrayList;

public class DogDemo {
    public static void main(String[] args) {
        List<String> doggo = new ArrayList<>();
        List<String> doggoCopy = new ArrayList<>(); 

        doggo.add("fluffy boi");
        doggo.add("teefy boi");
        doggo.add("long boi");
        doggo.add("comfuze boi");

        System.out.println(doggo);

        // Collection.sort
        doggo.sort((a, b) -> a.compareTo(b));
        System.out.println(doggo);

        // Collection.forEach
        doggo.forEach((d) -> doggoCopy.add(d));
        System.out.println("Doggo : " + doggo);
        System.out.println("Doggo Copy : " + doggoCopy);

        // Collection.removeIf
        doggo.removeIf((a) -> a.charAt(0) == 'l');
        System.out.println(doggo);

        // Simple ArrayList won't work due to typeSafty warning
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.forEach(a -> System.out.println(a));
    }
}