package com.zrandom.Arrays;

public class MaxSubArraySum {
    /*Answer 01 Using 3 loops O(n^3) */
    public static void answer01(int[] arr){
        int maxi = Integer.MIN_VALUE, start = 0,end = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int ans = 0;
                for(int k=i; k<=j; k++){
                    ans += arr[k];
                }
                if(ans > maxi){
                    maxi = ans;
                    start = i;
                    end = j;
                }
            }
        }
        for (int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("maximum Sum :"+maxi);
    }

    public static void answer02(int[] arr){
        int maxi = Integer.MIN_VALUE, start = 0,end = 0;
        for(int i=0; i<arr.length; i++){
            int ans = 0;
            for(int j=i; j<arr.length; j++){
                ans += arr[j];

                if(ans > maxi){
                    maxi = ans;
                    start = i;
                    end = j;
                }
            }
        }
        for (int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nmaximum Sum :"+maxi);
    }

    public static void answer03(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, end = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum>maxi){
                end = i;
                maxi = sum;
            }
            if(sum<0){
                sum = 0;
                start = i+1;
            }
        }
        for (int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nmaximum Sum :"+maxi);
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        answer03(arr);
    }
}
