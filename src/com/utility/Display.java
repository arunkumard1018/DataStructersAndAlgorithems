package com.utility;

import java.util.List;

public class Display {

    public static void display(int[] nums){
        for (int num : nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void display(int[][] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static <T> void display(List<T> nums){
        for(int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i));
        }
    }
}
