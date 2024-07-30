package com.dsa.P_00_Math;

public class S_01_BasicPrograms {
    public static int factorialOf(int num){
        int res = 1;
        for(int i=1; i<=num; i++){
            res *= i;
        }
        return res;
    }

    public static int fibOf(int n){
        int num1 = 0;
        int num2 = 1;
        for(int i=2; i<=n; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num2;
    }

    /*
     * Program to get sum of digits of given number n
     * TC O(N)
     * */
    public static int sumOfAllDigits(int n){
        int res = 0;
        while(n>0){
            res += n%10;
            n /= 10;
        }
        return res;
    }

    /*Reverse the  Given String */
    public static String reverseString(String str){
        char[] chr = str.toCharArray(); //Arun
        for(int i=0; i<chr.length/2; i++){
            swapChars(chr,i,chr.length-i-1);
        }
        return new String(chr);
    }
    public static void swapChars(char[] ch,int i,int j){
        char c = ch[i];
        ch[i] = ch[j];
        ch[j] = c;
    }

    public static void main(String[] args) {
        System.out.println("Answer is :"+ reverseString("aruna"));
    }
}
