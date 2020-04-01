package com.lambda.function;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lambda.repo.Person;
import com.lambda.repo.PersonRepository;

public class FunctionPersonDemo {

    static Function<String, Integer> func1 = name -> name.length();

    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = per -> per.getGender().equals("Male");

    static Function<List<Person>, Map<String, Double>> func2 = persons -> {
        Map<String, Double> map = new HashMap<String, Double>();
        persons.forEach(per -> {
            if(p1.and(p2).test(per))
                map.put(per.getName(), per.getSalary());
        });

        return map;
    };

    public static void main(String[] args) {
        System.out.println(func1.apply("Person"));
        List<Person> persons = PersonRepository.getAllPersons();

        System.out.println(func2.apply(persons));
    }
}