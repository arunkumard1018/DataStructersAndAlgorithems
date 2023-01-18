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
     * Problem : P_05 StockBuyAndSell
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

    /**
     * Problem : P_06 SetMatrixZeros
     * i/p : [ [ 1 1 1]
     *         [ 1 0 1]
     *         [ 1 1 1] ]
     *=======================================
     *  O/p : [ [ 1 0 1]
     *          [ 0 0 0]
     *          [ 1 0 1] ]
     * exp : if any row or col contains Zero Then set all elements present in row or col to Zero
     */
    public static void setMatrixZeros(int[][] nums){
        SetMatrixZero.SetZeros(nums);
    }

    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
//        System.out.print("Enter n Value : ");
//        int n = scan.nextInt();
//        System.out.println();

//        P_01 Pascale Triangle
//        for(List<Integer> data : pascaleTriangle(n)){
//            System.out.println(data.toString());
//        }

//        P_03 Kaden's Algorithem
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        maxSubArraySum(arr);

//        P_05 Stock Buy and Sell Problem
//        stockBuyAndSell(new int[] {7,1,5,3,6,4});

//        P_06 SetMatrixZeros
//        int[][] nums = {{1,1,1},
//                        {1,0,1},
//                        {1,1,1}};
//        com.utility.Arrays.display(nums);
//        setMatrixZeros(nums);
//        System.out.println("After Execution of SetMatrixZeros : ");
//        com.utility.Arrays.display(nums);

    }
}

class SetMatrixZero{
    private static int rows;
    private static int cols;
    public static void SetZeros(int[][] nums){
        rows = nums.length;
        cols = nums[0].length;
        boolean firstRowContainsZero = false;
        boolean firstColContainsZero = false;

        for(int j=0;j<cols; j++)
            if(nums[0][j] == 0) firstRowContainsZero = true;
        for(int i=0; i<rows; i++)
            if(nums[i][0] == 0) firstColContainsZero = true;

        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(nums[i][j] == 0){
                    nums[0][j] = 0;
                    nums[i][0] = 0;
                }
            }
        }
        for(int j=1; j<cols; j++)
            if(nums[0][j] == 0) nullifyCol(nums,j);

        for(int i=1; i<rows; i++)
            if(nums[i][0] == 0) nullifyRow(nums,i);

        if(firstColContainsZero) nullifyCol(nums,0);
        if(firstRowContainsZero) nullifyRow(nums,0);
    }
    private static void nullifyRow(int[][] nums,int i){
        for(int j=0; j<cols; j++) nums[i][j] = 0;
    }
    private static void nullifyCol(int[][] nums,int j){
        for(int i=0; i<rows; i++) nums[i][j] = 0;
    }
}
