package com.utility;

import java.util.ArrayList;

public class List{


    public static void display(java.util.List<ArrayList<Integer>> lst){
        for(ArrayList<Integer> data : lst)
            System.out.println(data);
    }
}
