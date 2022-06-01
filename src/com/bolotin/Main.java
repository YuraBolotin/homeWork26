package com.bolotin;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        // Задание 1
        for (int num : nums) {
            if (num % 2 != 0){
                System.out.print(num);
            }
        }
//        Задание 2
        System.out.println();
        Collections.sort(nums);
        int prevNum = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum){
                System.out.print(num);
                prevNum = num;
            }
        }
//        Задание 3
        System.out.println();
        Set<String> words = new HashSet<String>(Arrays.asList("Один", "Два", "Два", "Три", "Четыре", "Пять"));
        System.out.println(words);

//        Задание 4
        List<String> words2 = List.of("Один", "Два", "Два", "Три", "Три", "Четыре", "Четыре","Пять");
        Set<String> wordSet = new HashSet<>(words2);
        System.out.println((words2.size() - wordSet.size())*2);

    }
}
