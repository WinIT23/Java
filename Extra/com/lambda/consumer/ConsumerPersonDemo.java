package com.lambda.consumer;

import java.util.List;
import java.util.function.*;

import com.lambda.repo.Person;
import com.lambda.repo.PersonRepository;

public class ConsumerPersonDemo {

    
    static Consumer<List<Person>> c2 = (p) -> {
        p.stream().forEach(a -> {
            System.out.println("Name : " + a.getName() + "\nGender : " + a.getGender() + "\n"); 
        });
    };

    static Consumer<Person> c3 = (p) -> {
        System.out.print("Hobbies : ");
        p.getHobbies().forEach(h -> {
            System.out.print(h + " ");
        });
        System.out.println("\n");
    };
    
    static Consumer<Person> c1 = (p) -> {
        if(p.getHeight() >= 140) {
            System.out.println("Name :" + p.getName());
            c3.accept(p);
        }
    };

    static List<Person> persons = PersonRepository.getAllPersons();

    static void printNameAndHobbies() {
        persons.forEach(c1);
    } 

    public static void main(String[] args) {
        //c1.andThen(c3).accept(persons.get(0));
        //c2.accept(persons);
        printNameAndHobbies();
        
    }
}