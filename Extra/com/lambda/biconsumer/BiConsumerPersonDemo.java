package com.lambda.biconsumer;

import com.lambda.repo.Person;
import com.lambda.repo.PersonRepository;

import java.util.function.BiConsumer;
import java.io.PrintWriter;
import java.util.List;

public class BiConsumerPersonDemo {
    
    static PrintWriter out = new PrintWriter(System.out);

    static BiConsumer<String, List<String> > personNameAndHobbies = (name, hobbieList) -> {
        out.println("Name : " + name);
        out.print("Hobbies : "); 
        hobbieList.forEach(h -> {
            out.print(h + " ");
        });
        out.println("\n");
    };

    static void printPersonDetails() {
        List<Person> persons = PersonRepository.getAllPersons();

        persons.forEach(per -> {
            personNameAndHobbies.accept(per.getName() ,per.getHobbies());
        });
    }

    public static void main(String[] args) {
        printPersonDetails();
        out.flush();
    }
}