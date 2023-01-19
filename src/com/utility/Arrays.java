package com.utility;

public class Arrays{
    public static void swap(int a,int b,char[] str){
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }

    public static void display(int[][] nums){
        for(int[] arr : nums){
            for(int data : arr)
                System.out.print(data+"\t");
            System.out.println();
        }

    }
}
