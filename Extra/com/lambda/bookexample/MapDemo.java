package com.lambda.bookexample;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> dist = new HashMap<>();

        dist.put("Surat", 3);
        dist.put("Nadiyad", 1);
        dist.put("Baroda", 1);
        dist.put("Bharuch", 2);

        dist.keySet().forEach(k -> System.out.println(k));
        dist.values().forEach(v -> System.out.println(v));

        dist.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}