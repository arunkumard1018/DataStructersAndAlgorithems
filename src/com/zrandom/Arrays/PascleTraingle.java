package com.zrandom.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascleTraingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev=null, ans = null;

        for(int i=0; i<numRows; i++){
            ans = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    ans.add(1);
                }else{
                    int num = prev.get(j-1) + prev.get(j);
                    ans.add(num);
                }
            }
            result.add(ans);
            prev = ans;
        }
        return result;
    }
}
