package com.java_concepts_practice_sets.collections;

import java.util.*;

public class S_05_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(22);pq.offer(4);
        pq.offer(1);pq.offer(3);
        pq.offer(88);pq.offer(100);

        System.out.println(pq);//[1, 3, 4, 22, 88, 100]
        System.out.println(pq.peek()); //1

        /*Example 1: Finding the Top 3 elements */
        List<Integer> lst = new ArrayList<>();
        int index = 0;
        while(!pq.isEmpty()){
            if(index == 3) break;
            lst.add(pq.poll());
            index++;
        }
        System.out.println(pq);//[22, 100, 88]
        System.out.println("First Min Three Elements are : " + lst);//[1, 3, 4]

        /*Example 2 : find Last max there elements*/
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>((a,b)-> b-a);// Passing Comparator
        pq2.addAll(Arrays.asList(1, 3, 4, 22, 88, 100));
        System.out.println(pq2);// [100, 22, 88, 1, 4, 3] Note : Don't Traverse The PriorityQueue

        while(!pq2.isEmpty()){
            System.out.print(pq2.poll() + " "); // 100 88 22 4 3 1
        }
        System.out.println();
        /*Example 3 : For Object references
        * Find The Top 3 Students in Math */
        List<StudentMarks> slst = new ArrayList<>();
        slst.add(new StudentMarks(22,74));
        slst.add(new StudentMarks(54,64));
        slst.add(new StudentMarks(32,14));
        slst.add(new StudentMarks(72,34));
        slst.add(new StudentMarks(12,44));

        /*Implemented Using Comparator Interface */
        PriorityQueue<StudentMarks> spq = new PriorityQueue<>((a,b)->a.getMaths()-b.getMaths());
        spq.addAll(slst);

        while (!spq.isEmpty()){
            System.out.println(spq.poll());
        }
    }
}

class StudentMarks{
    private int maths;
    private int science;


    public StudentMarks(int maths, int science) {
        this.maths = maths;
        this.science = science;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }

    @Override
    public String toString() {
        return "maths=" + maths +
                ", science=" + science;
    }
}
