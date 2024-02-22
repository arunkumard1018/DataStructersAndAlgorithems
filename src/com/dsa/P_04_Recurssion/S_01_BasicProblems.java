package com.dsa.P_04_Recurssion;

public class S_01_BasicProblems {


    public static int factorialof(int num){
        if(num == 1) return num;
        return num * factorialof(num-1);
    }

    /**
     * Fibonacci Series Using Recursive Approach
     * Time Complexity: O(2N)
     * Auxiliary Space: O(1)
     * */
    public static int fibOf(int n){
        if(n==0 || n==1) return n;
        return fibOf(n-1)+fibOf(n-2);
    }

    /*
    * Fibonacci Series Using Memoization
    * Time Complexity: O(n)
    * Auxiliary Space: O(n)
    * */
    public static int fibSeries(int[] fib, int n){
        if(n==0 || n==1){
            fib[n] = n;
            return n;
        }
        if(fib[n] != 0){
            return fib[n];
        }
        else {
            fib[n] = fibSeries(fib, n-1) +  fibSeries(fib, n-2);
            return fib[n];
        }

    }


    public static void main(String[] args) {
        int[] arr = new int[9];
        System.out.println("Answer is "+ fibSeries(arr,8));
        com.utility.Display.display(arr);
    }
}
