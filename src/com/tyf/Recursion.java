package com.tyf;

public class Recursion {

    public static void SubSetSum(int index,int[] arr,int sum){
        if(index<0){
            System.out.print(sum+" ");
            return;
        }
        SubSetSum(index-1,arr,sum);
        SubSetSum(index-1,arr,sum+arr[index]);

    }




    public static void main(String[] args) {
//        System.out.println("on tyf Recursion main class");
        int[] arr = {10,1,2,7,6,1,5};
        SubSetSum(6,arr,0);
    }

}
