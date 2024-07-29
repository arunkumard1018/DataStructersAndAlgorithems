package com.java_concepts_practice_sets.collections;


import sun.swing.AccumulativeRunnable;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class S_08_HashSet {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(4);st.add(22);st.add(1);st.add(100);

        System.out.println(st);//[1, 4, 100, 22] insertion order not maintained
        System.out.println(st.isEmpty());
        System.out.println(st.contains(22)); //true
        System.out.println(st.remove(2)); //false

        Set<Integer> lkst = new LinkedHashSet<>();
        lkst.add(55);lkst.add(22);lkst.add(44);

        System.out.println(lkst);//[55, 22, 44] maintains insertion Order
        System.out.println(lkst.remove(22));// true

        Set<StudentsData> stdata = new HashSet<>();
        stdata.add(new StudentsData("Arun",22));
        stdata.add(new StudentsData("Manoj",23));
        stdata.add(new StudentsData("Arun",22));

        /*[{name='Manoj', age=23}, {name='Arun', age=22}, {name='Arun', age=22}]
        * O/p : Before overriding HashCode and Equals Method of StudentData Class
        System.out.println(stdata);
         */

        /*[{name='Arun', age=22}, {name='Manoj', age=23}]
        * O/p: After Overriding equals(0 and HashCode Methods of StudentData*/
        System.out.println(stdata);

        /*Note : if You Don't Override equal() and hashCode() method
        * By default Parent Object Class equal() and hashCode() Method
        * will be executed generally it us Object address as Hash code
        *
        * Hence we override  in the Student class that overrided methods will
        * be used that calculate hash based on Student Class Properties  */
    }
}
class StudentsData{
    private String name;
    private int age;

    public StudentsData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsData that = (StudentsData) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}