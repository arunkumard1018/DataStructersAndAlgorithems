package com.dsa.P_10_SortingAlgos;
import java.util.Arrays;


public class S_01_SelectionSort {
    /*Time complexity: O(N2), (where N = size of the array),
    for the best, worst, and average cases.
    the total steps will be approximately the following: (n-1) + (n-2) + (n-3) + ……..+ 3 + 2 + 1.
    The summation is approximately the sum of the first n natural numbers
    i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2).*/
    public static void selectionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[j] <= nums[i])
                    com.utility.util.swapArrayElements(i,j,nums);
            }
        }
    }




    public static void main(String[] args) {
        int[] nums = {13,46,24,52,20,9};
        System.out.println("Before Sorting :");
        Arrays.stream(nums).mapToObj(data -> data +" ").forEach(System.out::print);
        System.out.println("\nAfter Sorting :");
        selectionSort(nums);
        Arrays.stream(nums).mapToObj(data -> data +" ").forEach(System.out::print);


    }
}
