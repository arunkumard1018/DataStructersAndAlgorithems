package com.zrandom.Arrays;

public class StockBuyAndSell {
    public static int solun(int[] arr){
        int profit = 0;
        int max_profit = 0;
        int mini = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < mini){
                mini = arr[i];
            }
            profit = Integer.max(profit, arr[i] - mini);
        }
        return profit;

    }

    public static void main(String[] args) {
//        int[] arr =  {7,1,5,3,6,4};
        int[] arr = {7,6,4,3,1};
        System.out.println("The Maximum Profit : " + solun(arr));

    }
}
