package com.java.tuto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        //Sort

        List<String> list_fruit = fruits
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
//        list_fruit.forEach(System.out::println);
        System.out.println(list_fruit);

        System.out.println("***************************************************************************************************************************");


        List<String> list_fruit1 = fruits
                .stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
//        list_fruit.forEach(System.out::println);
        System.out.println(list_fruit1);

        System.out.println("***************************************************************************************************************************");


        List<String> list_fruit2 = fruits
                .stream()
                .sorted()
                .collect(Collectors.toList());
//        list_fruit.forEach(System.out::println);
        System.out.println(list_fruit2);
        System.out.println("***************************************************************************************************************************");


        //descending order

        List<String> list_fruit3 = fruits
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
//        list_fruit.forEach(System.out::println);
        System.out.println(list_fruit3);

        System.out.println("***************************************************************************************************************************");


        List<String> list_fruit4 = fruits
                .stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
//        list_fruit.forEach(System.out::println);
        System.out.println(list_fruit4);
        System.out.println("***************************************************************************************************************************");

        System.out.println("***************************************************************************************************************************");

        //sort employee by salary in ascending order

        List<Employee> list_employee = new ArrayList<Employee>();
        list_employee.add(new Employee(10, "Bilel", 27, 400000));
        list_employee.add(new Employee(20, "Fedi", 25, 500000));
        list_employee.add(new Employee(30, "nabil", 30, 350000));
        list_employee.add(new Employee(40, "oussema", 29, 200000));

        List<Employee> employeeSortedList = list_employee
                .stream()
                .sorted((new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return (int) (o1.getSalary() - o2.getSalary());
                    }
                }))
                .collect(Collectors.toList());

        System.out.println(employeeSortedList);


        System.out.println("***************************************************************************************************************************");


        // outre format sorted par salary
        List<Employee> employeeSortedList1 = list_employee
                .stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeeSortedList1);

        System.out.println("***************************************************************************************************************************");


        // outre format sorted par salary
        List<Employee> employeeSortedList2 = list_employee
                .stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(employeeSortedList2);


        System.out.println("***************************************************************************************************************************");


        //  format sorted par age
        List<Employee> employeeSortedList3 = list_employee
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(employeeSortedList3);


        System.out.println("***************************************************************************************************************************");


        //  format sorted par age reversed
        List<Employee> employeeSortedList4 = list_employee
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(employeeSortedList4);


        System.out.println("***************************************************************************************************************************");


        //  format sorted par name
        List<Employee> employeeSortedList5 = list_employee
                .stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(employeeSortedList5);


        System.out.println("***************************************************************************************************************************");


        //  format sorted par name reversed
        List<Employee> employeeSortedList6 = list_employee
                .stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println(employeeSortedList6);

    }
}

