package com.lambda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_P2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vinit", "K", "sdf", "K");

    // Before
        List<String> uniList = new ArrayList<>();
        for(String name : names) {
            if(!uniList.contains(name))
                uniList.add(name);
        }
        System.out.println("New List : " + uniList);

    // After
        List<String> uniList2 = names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("New List : " + uniList2);
    }
}