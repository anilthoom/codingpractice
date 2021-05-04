package com.anilt.java.features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Reference https://dev.to/deepsource/guidelines-for-java-code-reviews-3096
public class JavaBestPractices {
    public static void main(String[] args) {
        JavaBestPractices javaBestPractices = new JavaBestPractices();
        javaBestPractices.lambdasUse();
    }
    void lambdasUse(){
        /* Traditional imperative way */
        List<Integer> oddNumbers = new ArrayList<Integer>();
        for (Integer number: Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)){
            if (number % 2 != 0){
                oddNumbers.add(number);
            }
        }
        for (Integer n : oddNumbers){
            System.out.println(n);
        }

        /* Functional way of filtering odd numbers */
        List<Integer> oddNums = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());
        for (Integer n: oddNums){
            System.out.println(n);
        }
    }
}
class Items {
    private final List<Integer> items;
    public Items(List<Integer> items) {
        this.items = items; // chance of manipulations from client
    }
    public Integer highests() {
        if (items.isEmpty()) return null;
        Integer highest = null;
        for (Integer item : items) {
            if (items.indexOf(item) == 0) highest = item;
            else highest = highest > item ? highest : item;
        }
        return highest;
    }
}
