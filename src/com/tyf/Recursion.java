package com.tyf;

public class Recursion {

    public static void SubSetSum(int index,int[] arr,int sum){
        if(index<0){
            System.out.print(sum+" ");
            return;
        }
        SubSetSum(index-1,arr,sum+arr[index]);
        SubSetSum(index-1,arr,sum);

    }




    public static void main(String[] args) {
//        System.out.println("on tyf Recursion main class");
        int[] arr = {1,2,5};
        SubSetSum(2,arr,0);
    }

}
