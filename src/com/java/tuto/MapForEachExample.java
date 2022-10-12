package com.java.tuto;

import java.util.HashMap;
import java.util.Map;

public class MapForEachExample {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<Integer, Person>();

        map.put(1, new Person("fati", 30));
        map.put(2, new Person("soni", 28));
        map.put(3, new Person("raniya", 27));

        //use for each loop

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
            System.out.println(entry.getValue().getAge());
        }

        System.out.println("***************************************************************************************************************************");


        // use forEach() method + lambda expression

        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);

        });

    }
}
