package com.dsa.P_04_Recurssion;

public class S_02_BasicProblems {

    public static void reverseCharArray(char[] arr,int i){
        if(i >= (arr.length/2)) return;
        swap(arr,i,arr.length-1-i);
        reverseCharArray(arr,i+1);
    }
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static boolean checkPalindrome(String str,int i){
        if(i >=  (str.length()/2)) return true;
        if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        else return checkPalindrome(str,i+1);
    }

    public static int sumOf(int[] arr,int i){
        if(arr.length == i) return 0;
        return sumOf(arr,i+1) + arr[i];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("Answer is : "+sumOf(arr,0));
    }
}
