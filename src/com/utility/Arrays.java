package com.utility;

public class Arrays<T>{

    public static void swap(int a,int b,char[] str){
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }
    public static void swap(int a,int b,int[] str){
        int temp = str[a];
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
    public static void display(int[] arr){
        for (int data : arr){
            System.out.print(data +"\t");
        }
        System.out.println();
    }
}
