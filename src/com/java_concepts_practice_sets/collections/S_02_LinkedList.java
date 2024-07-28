package com.java_concepts_practice_sets.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class S_02_LinkedList {

    public static void main(String[] args) {
        List<Integer> lst  = new LinkedList<>(Arrays.asList(4,6,8,10));
        lst.add(100);

        System.out.println(lst); //[4, 6, 8, 10, 100]
        lst.remove(2);
        System.out.println(lst);//[4, 6, 10, 100]

        ListIterator<Integer> itr = lst.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next()); // 4,6,10,100
        }

        while(itr.hasPrevious()){
            System.out.println(itr.previous()); //100,10,6,4
        }

        System.out.println(lst.set(3,12)); //100
        System.out.println(lst); //[4, 6, 10, 12]

    }
}
