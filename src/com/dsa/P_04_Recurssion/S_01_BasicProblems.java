package com.dsa.P_04_Recurssion;

public class S_01_BasicProblems {

    /**
     * Factorial of a given number n Using Recursive Approach
     * Time Complexity: O(N)
     * Auxiliary Space: O(1)
     * */
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

    /*
    * Program to first n natural number
    * TC O(N)
    * */
    public static void printNnaturalNumbers(int n){
        if(n<0) return;
        printNnaturalNumbers(n-1);
        System.out.print(n+" ");
    }
    /*
     * Program to count the digits of given number n
     * TC O(N)
     * */
    public static int countDigOfNum(int n){
        if(n<=0) return 0;
        return countDigOfNum(n/10)+1;
    }

    /*
     * Program to get sum of digits of given number n
     * TC O(N)
     * */
    public static int sumOfAllDigits(int n){
        if(n<10) return n;
        return sumOfAllDigits(n/10) + n%10;
    }



    public static void main(String[] args) {
        System.out.println("the Answer is : "+sumOfAllDigits(21));
    }
}
