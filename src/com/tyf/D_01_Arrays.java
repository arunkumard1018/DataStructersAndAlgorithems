package com.tyf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D_01_Arrays {

    /**
     * Problem : P_01
     * @param n
     * @return the List containing Pascale triangle of range n
     * sample i/p n = 5;
     * o/p :[1]
     *      [1, 1]
     *      [1, 2, 1]
     *      [1, 3, 3, 1]
     *      [1, 4, 6, 4, 1]
     */
    public static List<List<Integer>> pascaleTriangle(int n){
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans,prev = null;
        for(int i=0; i<n; i++){
            ans = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    ans.add(1);
                }else{
                    ans.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev = ans;
            res.add(ans);
        }
        return res;
    }

    public static void sortZerosandOnes(int[] arr){

    }


    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter n Value : ");
        int n = scan.nextInt();
        System.out.println();

//        // P_01 Pascale Triangle
//        for(List<Integer> data : pascaleTriangle(n)){
//            System.out.println(data.toString());
//        }


    }
}
