package com.lambda.predicate;

import java.util.List;

import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.lambda.repo.Person;
import com.lambda.repo.PersonRepository;

public class ConsumerPredicateDemo {

    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = per -> per.getGender().equals("Male");

    static BiPredicate<Integer, String> p3 = (height, gender) -> height >= 140 && gender.equals("Male");

    static BiConsumer<String, List<String>> hobbieConsumer = (name, hobbies) -> System.out
            .println(name + " : " + hobbies);

    static Consumer<Person> personConsumer = per -> {
        if (p3.test(per.getHeight(), per.getGender())) {
            hobbieConsumer.accept(per.getName(), per.getHobbies());
        }
    };

    public static void main(String[] args) {
        List<Person> persons = PersonRepository.getAllPersons();

        persons.forEach(personConsumer);
    }
}