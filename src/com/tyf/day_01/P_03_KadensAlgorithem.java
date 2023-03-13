package com.tyf.day_01;

/**
 * Solution to find maximum sub Array Sum
 * i/p: arr = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
class Solution_P_03{
    /*Solun 01 TC : O(n^3) */
    public static int solun_01(int[] arr){
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                maxSum = Integer.max(sum ,maxSum);
                sum = 0;
            }
        }
        return  maxSum;
    }
    public static int solun_02(int[] arr){
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<arr.length; i++){
            sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                maxSum = Integer.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    /*Solution_01 Using Kaden's Algorithm */
    public static int solun_03(int[] arr){
        int maxi = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            maxi = Integer.max(sum,maxi);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
public class P_03_KadensAlgorithem {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//        int arr[] = {1,2,3,4};
        com.utility.Arrays.display(arr);
        System.out.println("After Execution : " + Solution_P_03.solun_03(arr));
    }
}

