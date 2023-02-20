package com.tyf.day_01;

/** The program is to find the maximum profit earned by selling the task
 *  i/p : [7,1,5,3,6,4]
 *  O/P : 5
 *  Exp : buy on day 2 and sell on day 04
 *        max profit = 6-1 = 5
 */
public class P_05_StockBuyAndSell {

    /* BrutForce Solution for find maximum Profit TC:O(n) */
    public static int solution_01(int[] arr){
        int max_profit = 0;
        int profit = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int sell_price = arr[j] - arr[i];
                if(sell_price > profit)
                    profit = sell_price;
            }
            max_profit = Integer.max(max_profit,profit);
        }
        return max_profit;
    }
    public static int solution_02(int[] arr){
        int max_profit = 0;
        int min_price = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min_price){
                min_price = arr[i];
            }else {
                max_profit = Integer.max(max_profit,arr[i] - min_price);
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        com.utility.Arrays.display(arr);
        System.out.println("The Max Profit : " + solution_02(arr));
    }

}
