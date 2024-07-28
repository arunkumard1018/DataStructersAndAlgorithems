package com.java_concepts_practice_sets.streamApis;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_03_Streams {
    public static void main(String[] args) {
        Student s1 = new Student("Arun",22,82);
        Student s2 = new Student("Chirag",23,72);
        Student s3 = new Student("Manoj",24,42);
        Student s4 = new Student("Chandan",22,32);
        Student s5 = new Student("Nagaraju",25,92);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);
        List<String> collect = students.stream()
                .filter(student -> student.getScore() > 50)
                .map(student -> student.getName() + " " + student.getScore())
//                .limit(2)  // to limit only first 2
//                .forEach(student -> System.out.println(student)); // you can collect instead of printing
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}

class Student{
    String name;
    int age;
    int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}
