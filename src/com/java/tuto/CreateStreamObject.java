package com.java.tuto;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObject {

    public static void main(String[] args) {

        //create a stream
        Stream<String> stream = Stream.of("a", "b", "c", "d");
        stream.forEach(System.out::println);
        System.out.println("***********************************************************************************************************");

        //create a stream from sources
        //Collection
        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "JPA", "Hibernate");

        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);
        System.out.println("***********************************************************************************************************");


        //list
        List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "JPA", "Hibernate");

        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);
        System.out.println("***********************************************************************************************************");


        //set
        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);
        System.out.println("***********************************************************************************************************");


        String[] strArrays = {"a", "b", "c", "d"};
        Stream<String> stream5 = Arrays.stream(strArrays);
        stream5.forEach(System.out::println);
        System.out.println("***********************************************************************************************************");


    }
}
