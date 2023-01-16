package com.tyf;

public class Test {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int start = 0,end = nums.length-1;
        int maxi = 0,sum;
        for(int i=0; i<nums.length; i++){
            sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum>maxi){
                    maxi = sum;
                    start = i;
                    end = j;
                }

            }
        }
        System.out.println("maxi :"+ maxi);
        for(int i=start; i<=end; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
