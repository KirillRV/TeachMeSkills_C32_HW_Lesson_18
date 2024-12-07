package com.teachmeskills.lesson_18.task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AppRunner {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new Random()
                .ints(1,20)
                .limit(50)
                .boxed()
                .collect(Collectors.toList());
       System.out.println(listOfNumbers);

        listOfNumbers = listOfNumbers.stream()
                .distinct()
                .map(item -> item * 2)
                .collect(Collectors.toList());
        System.out.println("-------------------------------------------");
        System.out.println(listOfNumbers);

        listOfNumbers = listOfNumbers.stream()
                .filter(n -> n >= 7 && n <= 17)
                .collect(Collectors.toList());
        System.out.println("--------------------------------------------");
        System.out.println(listOfNumbers);

        listOfNumbers = listOfNumbers.stream()
                .limit(4)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("--------------------------------------------");
        System.out.println(listOfNumbers);

        int AmountOfElements = (int) listOfNumbers.stream()
                .count();
        System.out.println("--------------------------------------------");
        System.out.println(AmountOfElements);

        double Average =listOfNumbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("--------------------------------------------");
        System.out.println(Average);





    }
}
