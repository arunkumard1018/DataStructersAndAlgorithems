package com.tyf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_01_Arrays {

    /**
     * Problem : P_01
     * @param n
     * @return the List containing Pascale triangle of range n
     * sample i/p n = 5;
     * o/p :[1]
     *      [1, 1]
     *      [1, 2, 1]
     *      [1, 3, 3, 1]
     *      [1, 4, 6, 4, 1]
     */
    public static List<List<Integer>> pascaleTriangle(int n){
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans,prev = null;
        for(int i=0; i<n; i++){
            ans = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    ans.add(1);
                }else{
                    ans.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev = ans;
            res.add(ans);
        }
        return res;
    }

    public static void sortZerosandOnes(int[] arr){

    }

    /**
     * Problem : P_04 Kaden's Algorithm
     * @param arr
     * sample i/p : {-2,1,-3,4,-1,2,1,-5,4}
     * O/p : The Maximum sub Array Sum is  :6
     *     [4 -1 2 1]
     */
    public static void maxSubArraySum(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int sum = 0,start = 0, end = arr.length-1;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
                end = i;
            }
            if(sum<0){
                sum = 0;
                start = i+1;
            }
        }
        System.out.println("The max sum : "+maxi);
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * Problem : P_06 StockBuyAndSell
     * @param nums You are given an array of prices where nums[i] is the price of a given stock on an ith day.
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and
     *              sell on day 5 (price = 6), profit = 6-1 = 5.
     */
    public static void stockBuyAndSell(int[] nums){
        int min = nums[0];
        int profit = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            min = Integer.min(min,nums[i]);
            profit = Integer.max(profit, nums[i] - min);
        }
        System.out.println("Maximum Profit : "+profit);
    }

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
//        System.out.print("Enter n Value : ");
//        int n = scan.nextInt();
//        System.out.println();

//        // P_01 Pascale Triangle
//        for(List<Integer> data : pascaleTriangle(n)){
//            System.out.println(data.toString());
//        }

//        P_04 Kaden's Algorithem
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        maxSubArraySum(arr);
//        stockBuyAndSell(new int[] {7,1,5,3,6,4});

    }
}
