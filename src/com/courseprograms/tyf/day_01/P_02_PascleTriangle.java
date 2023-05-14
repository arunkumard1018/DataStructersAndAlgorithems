package com.courseprograms.tyf.day_01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_02_PascleTriangle {

    public static List<ArrayList<Integer>> pascleTriangle(int n){
        ArrayList<Integer> answer;
        ArrayList<Integer> prev = null;
        List<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            answer = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    answer.add(1);
                }else{
                    int res = prev.get(j-1) + prev.get(j);
                    answer.add(res);
                }
            }
            prev = answer;
            result.add(answer);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter n value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();

        com.utility.List.display(pascleTriangle(n));
    }
}
