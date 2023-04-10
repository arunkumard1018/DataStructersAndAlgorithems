package com.zrandom.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascleTriangle {
    public static List<ArrayList<Integer>> Solun(int n){

        ArrayList<Integer> lst = null, prev = null;
        List<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            lst = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || i==j){
                    lst.add(1);
                }else{
                    int res = prev.get(j) + prev.get(j-1);
                    lst.add(res);
                }
            }
            prev = lst;
            ans.add(lst);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        com.utility.List.display(Solun(n));

    }
}
