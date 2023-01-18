package com.tap;

import java.util.Scanner;
import com.utility.*;

public class Recursion {


    /**
     *  problem : P_01
     *  SubSequence of a given String
     *  i/p : str = "abc"
     *  o/p : [ "abc", "ab", "ac", "a","b", "bc", "c", " "]
     *  total 2^3 combinations
     */
    public static void subSeq(String s,StringBuilder ans,int i){
        if(i == s.length()){
            System.out.print(ans.toString()+" ");
            return;
        }
        ans.append(s.charAt(i));
        subSeq(s,ans,i+1);
        ans.deleteCharAt(ans.length()-1);
        subSeq(s,ans,i+1);
    }

    /**
     * Problem : P_02
     * To Print All The Permutations of the Given String
     * ex : i/p : "abc"
     * o/p : "abc", "acb", "bca", "bac", "cab", "cba"
     */
    public static void  permutations(int index,char[] str){
        if(index == str.length){
            System.out.print(new String(str)+" ");
            return;
        }

        for(int i=index; i<str.length; i++){
            Arrays.swap(i,index,str);
            permutations(index+1,str);
            Arrays.swap(i,index,str);
        }
    }

    /**
     * Problem : P_03
     * i/p : arr = [10,20,15,5] sum = 25
     * 0/p : 2
     * exp : 10+15 = 25
     *       20+5 = 25
     */
    public static int subseqsum(int sum,int[] arr,int index){
        if(sum == 0){
            return 1;
        }
        if(index == arr.length || sum < 0 ){
            return 0;
        }
        return subseqsum(sum-arr[index],arr,index+1) +
                subseqsum(sum,arr,index+1);
    }

    /**
     * Problem : P_08
     * @param n and print the all possible valid combination of parenthesis
     * ex : i/p n=3
     *      o/p : ((())), ()()(),()(()),(())(),(()())
     */
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
        System.out.print("Enter Input : ");

//        int n = scan.nextInt();
//        balancedParanthsis(n,0,0,new StringBuilder());
//        String str = scan.nextLine();
//        subSeq(str,new StringBuilder(),0);
//        permutations(0,str.toCharArray());
//        int[] arr = {10,20,15,5};
//        int n = 25;
//        System.out.println("The Answer is : "+subseqsum(n,arr,0));

    }

}
