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
        for(int i=1; i<n; i++){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num2;
    }
    public static void main(String[] args) {
        System.out.println("Answer is "+ fibOf(6));
    }
}
