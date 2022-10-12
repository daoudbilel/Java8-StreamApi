package com.java.tuto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetlistForeachExample {
    public static void main(String[] args) {

        Set<Person> set = new HashSet<>();

        set.add(new Person("daoudbilel", 27));
        set.add(new Person("feditaktek", 25));
        set.add(new Person("oussemamakwar", 24));

        //for each loop

        for (Person person : set) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

        System.out.println("***************************************************************************************************************************");


        //foreach  method + lambda
        set.forEach((person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }));
        System.out.println("***************************************************************************************************************************");


        //using stream with forEach() method

        set.stream().forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });

    }


}
