package com.practiceprograms.day_02;

/**
 * Kadane’s Algorithm : Maximum Subarray Sum in an Array
 * Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
 * has the largest sum and returns its sum and prints the subarray.
 * Examples:
 * Input: arr = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class P_01_KadensAlgo {
    /**
     * Solution using the brut force Approach
     * TC : O(n^3) using Three loops
     */
    public static void answer_01(int[] arr){
        int ans = 0,start=0,end=arr.length;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                if(sum>ans){
                    ans = sum;
                    start = i;
                    end = j;
                }
            }
        }
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nMaximum sub array is : "+ans);
    }
    /**
     * Solution using the Better Approach
     * TC : O(n^2) using Two loops
     */
    public static void answer_02(int[] arr){
        int ans = 0,start=0,end=arr.length;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                if(sum<0){
                    sum = 0;
                }
                if(sum>ans){
                    ans = sum;
                    start = i;
                    end = j;
                }
            }
        }
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nMaximum sub array is : "+ans);
    }
    /**
     * Solution using the Optimized Approach by using kaden's algorithm
     * TC : O(n)
     */
    public static void answer_03(int[] arr){
        int start = 0, end = arr.length,sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
                end = i;
            }
            if(sum < 0){
                sum = 0;
                start = i+1;
            }
        }
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nMaximum sub array is : "+maxi);
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        answer_03(arr);
    }
}
