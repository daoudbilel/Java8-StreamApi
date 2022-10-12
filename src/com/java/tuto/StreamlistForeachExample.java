package com.java.tuto;

import java.util.ArrayList;
import java.util.List;

public class StreamlistForeachExample {

    public static void main(String[] args) {

        List<Person> list_persons = new ArrayList<Person>();

        list_persons.add(new Person("daoudbilel", 27));
        list_persons.add(new Person("feditaktek", 25));
        list_persons.add(new Person("oussemamakwar", 24));

        //prior java 8
        for (Person person : list_persons) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
        System.out.println("***************************************************************************************************************************");

        list_persons.forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });
        System.out.println("***************************************************************************************************************************");

        //Stream
        list_persons.stream().forEach(person -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        });


    }
}


class Person {

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}