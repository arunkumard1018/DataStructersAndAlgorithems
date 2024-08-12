package com.dsa.P_10_SortingAlgos;

import java.util.Arrays;

public class S_02_BubbleSort {
    /*Time complexity: O(N2), (where N = size of the array),
    for the worst, and average cases.*/
    public static void bubbleSort(int[] nums){
        int swapCount = 0;
        for(int i=nums.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(nums[j] > nums[j+1]){
                    swapCount++;
                    com.utility.util.swapArrayElements(j,j+1,nums);
                }
                if (swapCount == 0) break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {13,46,24,52,20,9};
        System.out.println("Before Sorting :");
        Arrays.stream(nums).mapToObj(data -> data +" ").forEach(System.out::print);
        System.out.println("\nAfter Sorting :");
        bubbleSort(nums);
        Arrays.stream(nums).mapToObj(data -> data +" ").forEach(System.out::print);
    }
}
