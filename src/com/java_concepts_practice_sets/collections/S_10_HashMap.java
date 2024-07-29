package com.java_concepts_practice_sets.collections;

import java.util.HashMap;
import java.util.Map;

public class S_10_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Arun",22);
        map.put("Manoj",32);
        map.put("Chirag",22);

        System.out.println(map); // {Arun=22, Chirag=22, Manoj=32}

        System.out.println(map.get("Arun")); //22
        System.out.println(map.get("arun")); // null
        System.out.println(map.getOrDefault("arun",555));//555

        System.out.println(map.keySet()); // [Arun, Chirag, Manoj]

        System.out.println(map.putIfAbsent("Arun",111)); // 22
        System.out.println(map);//{Arun=22, Chirag=22, Manoj=32}

        System.out.println(map.putIfAbsent("Cap",111)); // null
        System.out.println(map);//{Cap=111, Arun=22, Chirag=22, Manoj=32}

        System.out.println(map.containsKey("Arun")); // true
        System.out.println(map.containsValue("Harry"));//false
    }
}
