package com.algorithems.arrays;

public class P_01_SearchingAlgo {

    public static int binarySearch(int[] nums,int key){
        int low = 0;
        int high = nums.length-1;
        int mid;

        while (low <= high){
            mid = (low+high)/2;
            if(nums[mid] == key) return key;
            else if(key > nums[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;

    }
    public static int linearSearch(int[] nums,int key){
     for(int i=0; i<nums.length; i++){
         if(nums[i] == key) return i;
     }
     return -1;
    }

}
