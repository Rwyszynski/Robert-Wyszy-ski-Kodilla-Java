package com.kodilla.testing.collection;
import java.util.*;
import java.util.stream.Collectors;

public class OddNumbersExterminator {


    private List<Integer> numbers;

    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate() {

        List<Integer> evenList = numbers.stream().filter(num -> num % 2 == 0 ).collect(Collectors.toList());

        System.out.println(evenList);
        return evenList;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
