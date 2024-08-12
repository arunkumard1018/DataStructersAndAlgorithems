package com.dsa.P_10_SortingAlgos;

import java.util.Arrays;

public class S_03_InsertionSort {
    /*The best case occurs if the given array is already sorted.And if the given array is already sorted,
    the outer loop will only run and the inner loop will run for 0 times.
    So, our overall time complexity in the best case will boil down to O(N), where N = size of the array.*/
    private static void insertionSort(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int j = i;
            while(j>0 && nums[j] < nums[j-1]){
                com.utility.util.swapArrayElements(j,j-1,nums);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {13,46,24,52,9,20,20};
        System.out.println("Before Sorting :");
        Arrays.stream(nums).mapToObj(data -> data +" ").forEach(System.out::print);
        System.out.println("\nAfter Sorting :");
        insertionSort(nums);
        Arrays.stream(nums).mapToObj(data -> data +" ").forEach(System.out::print);
    }

}
