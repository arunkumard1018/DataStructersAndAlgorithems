package com.dsa.arrays.binarysearch;

import com.utility.Inputs;

public class P_01_SearchInArray {
    /*Program_01 Binary Search*/
    public static int BinarySearch(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low <= high){
            mid = (low+high)/2;
            if(target == nums[mid]) return mid;
            else if(target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args) {

//        com.utility.Display.display(Inputs.sortedArray_1);
//        System.out.println("Result : "+BinarySearch(Inputs.sortedArray_1,4));
//        com.utility.Display.display(Inputs.sortedArray_2);
//        System.out.println("Result : "+BinarySearch(Inputs.sortedArray_2,4));
//        com.utility.Display.display(Inputs.sortedArray_2);
//        System.out.println("Result : "+BinarySearch(Inputs.sortedArray_2,5));

    }
}
