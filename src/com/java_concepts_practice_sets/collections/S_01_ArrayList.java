package com.java_concepts_practice_sets.collections;

import java.util.ArrayList;

public class S_01_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println(arr.isEmpty()); // true
        System.out.println(arr.size()); // 0
        arr.add(25);
        arr.add(45);
        System.out.println(arr); // [25, 45]
        arr.remove(1);
        System.out.println(arr); // [25]


    }
}
