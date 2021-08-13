package com.example.babysitterapp.sample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SampleTest {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).map(Employee::getName).forEach(System.out::println);
    }
}
