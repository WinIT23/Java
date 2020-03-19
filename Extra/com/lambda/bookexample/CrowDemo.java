package com.lambda.bookexample;

import java.util.function.Consumer;

class Crow {
    private String color;
    public void caw(String name) {
        String volume = "loudly";
        //name = "Vinit";
        color = "Same as Shit!!";

        Consumer<String> consumer = (s) -> /* Variables used must be "effectively final" */
                System.out.println(name + " says " + volume + " that he is " + color);

        consumer.accept("");
        //volume = "gently";
    }
}

public class CrowDemo {
    public static void main(String[] args) {
        Crow cr = new Crow();

        cr.caw("Vinit");
    }
}