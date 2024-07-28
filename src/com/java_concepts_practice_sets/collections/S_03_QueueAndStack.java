package com.java_concepts_practice_sets.collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class S_03_QueueAndStack {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(22);
        q.offer(33);
        System.out.println(q); // [22, 33]


        System.out.println(q.peek()); //22
        System.out.println(q); //[22 ,33]

        System.out.println(q.poll());//22
        System.out.println(q);//[33]
        q.offer(44); q.offer(66);

        System.out.println(q.element()); //33
        System.out.println(q); //[33, 44, 66]

        System.out.println("Stack DataStructr");
        Stack<Integer> stk = new Stack<>();
        System.out.println(stk.push(44));
        stk.push(55);stk.push(66);stk.push(77);

        System.out.println(stk);// [44, 55, 66, 77]
        System.out.println(stk.peek()); //77

        System.out.println(stk.pop()); // 77
        System.out.println(stk);//[44, 55, 66]

        System.out.println(stk.firstElement()); //44







    }
}
