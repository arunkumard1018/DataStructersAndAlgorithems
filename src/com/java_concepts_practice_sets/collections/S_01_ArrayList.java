package com.java_concepts_practice_sets.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_01_ArrayList {

    public static void main(String[] args) {
        /* Different Ways of Creating Array List*/

        /*Constructs an empty list with an initial capacity of ten.*/
        ArrayList<Integer> arr = new ArrayList<>();

        /*Constructs an empty list with an initial capacity of 15 provided.*/
        ArrayList<Integer> arr2 = new ArrayList<>(15);

      /*  Constructs a list containing the elements of the specified collection,
        in the order they are returned by the collection's iterator
        DEEP COPY .*/
        ArrayList<Integer> arr3 = new ArrayList<Integer>(arr);


        System.out.println(arr.isEmpty()); // true
        System.out.println(arr.size()); // 0
        arr.add(25);
        arr.add(45);
        arr.add(55);
        arr.add(2);
        arr.add(10);
        List<Integer> alst = new ArrayList<>(Arrays.asList(2,4,6,8));
        System.out.println(arr); // [25, 45,55,2,10]
        System.out.println(arr.remove(1)); // 45
        System.out.println(arr); // [25,55,2,10]

        arr.addAll(alst);
        System.out.println(arr);//[25, 55, 2, 10, 2, 4, 6, 8]

        System.out.println(arr.indexOf(2)); // 2
        System.out.println(arr.lastIndexOf(2)); // 4

        System.out.println(arr.set(4,65));//  2
        System.out.println(arr);// [25, 55, 2, 10, 65, 4, 6, 8]

        List<Integer> subAlst = arr.subList(1,5);
//        NOTE : SHALLOW COPY
        System.out.println(subAlst); // [55,2,10,65]

        subAlst.set(1,22);
        System.out.println(subAlst); //[55,22,10,65]
        System.out.println(arr); // [25, 55, 22, 10, 65, 4, 6, 8]

        arr.sort((a,b) -> b-a);
        System.out.println(arr);




    }
}
