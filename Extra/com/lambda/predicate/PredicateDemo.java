package com.lambda.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.lambda.repo.Person;
import com.lambda.repo.PersonRepository;

public class PredicateDemo {
    
    static Predicate<Person> p1 = p -> p.getHeight() >= 140;
    static Predicate<Person> p2 = p -> p.getGender().equals("Male");
    
    public static void main(String[] args) {
        List<Person> persons = PersonRepository.getAllPersons();

        persons.stream()
            .filter(p2)
            .collect(Collectors.toList());
        
        persons.forEach(person -> {
            if(p1.and(p2).test(person)) {
                System.out.println(person);
            }
        });
    }
}
