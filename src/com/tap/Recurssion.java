package com.tap;

import java.util.Scanner;

public class Recurssion {

    public static void balancedParanthsis(int n,int open,int close,StringBuilder res){
        if(close == n){
            System.out.println(res.toString());
            return;
        }
        if(open < n){
            res.append('(');
            balancedParanthsis(n,open+1,close,res);
            res.deleteCharAt(res.length()-1);
        }
        if(close < open){
            res.append(')');
            balancedParanthsis(n,open,close+1,res);
            res.deleteCharAt(res.length()-1);
        }
    }










    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = scan.nextInt();

        balancedParanthsis(n,0,0,new StringBuilder());
    }
}
