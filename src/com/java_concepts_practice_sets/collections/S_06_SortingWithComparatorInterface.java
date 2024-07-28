package com.java_concepts_practice_sets.collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class S_06_SortingWithComparatorInterface {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students("sharath",22));
        students.add(new Students("chirag",21));
        students.add(new Students("arun",24));
        students.add(new Students("chandan",26));
        students.add(new Students("manoj",20));

//        students.sort(new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
////                return -(o1.getAge()-o2.getAge()); //Descending by age
//                return -(o1.getName().compareTo(o2.getName()));
//            }
//        });
        students.sort((a,b)->a.getName().compareTo(b.getName()));
        for (Students s: students){
            System.out.println(s);
        }
    }
}

class Students{
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
}