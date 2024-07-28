package com.java_concepts_practice_sets.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class S_04_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> adq = new ArrayDeque<>();
        adq.offer(22);
        adq.offer(44);
        adq.offerLast(55);
        adq.offerFirst(33);
        System.out.println(adq);//[33, 22, 44, 55]

        System.out.println(adq.peekFirst()); //33
        System.out.println(adq.peekLast());//55

        System.out.println(adq.pollFirst());//33
        System.out.println(adq.pollLast());//55
        System.out.println(adq);//[22, 44]
    }
}
