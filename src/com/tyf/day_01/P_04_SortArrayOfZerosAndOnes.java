package com.tyf.day_01;
public class P_04_SortArrayOfZerosAndOnes {
    /* Brut Force approach by using Sorting TC: O(nlog(n)) SC:O(1) */
    public static void solution_01(int[] arr){
        java.util.Arrays.sort(arr);
    }
    /* Optimized approach TC:O(n) */
    public static void solution_02(int[] arr){
        int zeros,ones,twos;
        zeros = ones = twos  = 0;
        for(int data : arr){
             if(data == 0)
                 zeros++;
             if(data == 1)
                 ones++;
             if(data == 2)
                 twos++;
            }
        int i = 0;
        while (zeros > 0){
            arr[i] = 0;
            zeros--; i++;
        }
        while (ones > 0){
            arr[i] = 1;
            ones--; i++;
        }
        while (twos > 0){
            arr[i] = 2;
            twos--; i++;
        }
    }

    public static void solution_03(int[] arr){
        int low = 0,mid = 0,heigh = arr.length-1;
        while (mid<=heigh){
            switch (arr[mid]){
                case 0:{
                    com.utility.Arrays.swap(low,mid,arr);
                    low++;
                    mid++;
                }
                case 1:{
                    mid++;
                }
                case 2:{
                    com.utility.Arrays.swap(mid,heigh,arr);
                    heigh--;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        com.utility.Arrays.display(arr);
//        solution_01(arr);
//        solution_02(arr);
        solution_03(arr);
        System.out.println("After Execution :");
        com.utility.Arrays.display(arr);
    }
}
