package com.java_concepts_practice_sets.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class S_07_SortingWithComparableInterface {
    public static void main(String[] args) {
        List<Employee> employes = new ArrayList<>();
        employes.add(new Employee("sharath",22));
        employes.add(new Employee("Chirag",21));
        employes.add(new Employee("Arun",24));
        employes.add(new Employee("chandan",26));
        employes.add(new Employee("Manoj",20));

        Collections.sort(employes);

        for (Employee s: employes){
            System.out.println(s);
        }
    }
}




class Employee implements Comparable<Employee>{
    private String name;
    private int age;

    public Employee(String name, int age) {
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

    @Override
    public int compareTo(Employee o) {
        /*if this object < other Object return -ve
        * if this object is > other object return +ve
        * if both object are equal return 0 */


//        return this.age - o.age; //ascending
        return o.age - this.age; //descending

    }
}