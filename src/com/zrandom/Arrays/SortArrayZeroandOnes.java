package com.zrandom.Arrays;

public class SortArrayZeroandOnes {
    public void swap(int i,int j,int[] nums){
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
    public void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length-1;

        while(mid<= high){
            switch(nums[mid]) {
                case 0 :
                    swap(low,mid,nums);
                    mid++;
                    low++;
                    break;

                case 1 :
                    mid++;
                    break;
                case 2 :
                    swap(mid,high,nums);
                    high--;
                    break;
            }
        }
    }
}
