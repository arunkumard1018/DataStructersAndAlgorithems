package com.zrandom.Arrays;

import jdk.nashorn.internal.runtime.JSONListAdapter;

public class SortZerosAndOnes {
    public static void sortArray(int[] arr){
        int mid =0, low = 0;
        int high = arr.length-1;

        while (mid<=high){
            switch (arr[mid]){
                case 0 : {
                    com.utility.Arrays.swap(low,mid,arr);
                    low++; mid++;
                    break;
                }
                case 1 :{
                    mid ++;
                    break;
                }
                case 2 :{
                    com.utility.Arrays.swap(mid,high,arr);
                    high--;
                    break;
                }


            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,1,1,0,0,0,1,2,2,2};
        com.utility.Arrays.display(arr);
        System.out.println("After Execution :");
        sortArray(arr);
        com.utility.Arrays.display(arr);
    }
}
