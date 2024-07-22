package com.java_concepts_practice_sets.streamApis;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test_01_Streams {
    public static void main(String[] args) {


        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        };
        Consumer<String> consumer =  new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Printing The String " +"s");
            }
        };
        /* Example 1 : Creating Streams using Stream Api
            >> In this Case .generate() is Working as Data Source
            >>Generate Keep Generate Data Which Are Streamed in Data Pipe

        Stream<String> stream = Stream.generate(supplier);
        stream.forEach(consumer);
         */

        /** Example 2 :
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        stream.forEach(integer -> System.out.println(integer));
         */




    }
}
