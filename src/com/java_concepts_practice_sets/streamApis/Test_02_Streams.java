package com.java_concepts_practice_sets.streamApis;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test_02_Streams {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7,8};
        Stream<Integer> stream = Arrays.stream(nums);

//       Ex : 1 To Print The Number Greater than 1
//        stream.filter(num -> num%2 == 0)
//                .forEach(num -> System.out.println(num));

//        Map Function used for transformation
//        Ex :2
//        stream.map(integer -> "The Number is "+integer)
//                .forEach(data -> System.out.println(data));

//        Ex : 3
        stream.filter(num -> num>4)
                .map(num -> {
                    switch (num){
                        case 5 :
                            return "five";
                        case 6:
                            return "six";
                        case 7 :
                            return "Seven";
                        case 8:
                            return "Eight";
                    }
                    return "default"+num;
                })
                .forEach(num -> System.out.println(num));


    }
}
