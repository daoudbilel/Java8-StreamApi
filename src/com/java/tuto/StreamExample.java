package com.java.tuto;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //count(),min() ,max() , methods

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println(stream.count());

        System.out.println("***************************************************************************************************************************");

        Integer min = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min => " + min);

        System.out.println("***************************************************************************************************************************");

        Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max => " + max);


    }
}
