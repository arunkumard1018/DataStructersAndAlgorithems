package com.dsa.P_09_Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class S_01_LeetCode349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st = new HashSet(Arrays.asList(nums1));
        System.out.print(st);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums2.length; i++){
            if(st.contains(nums2[i])){
                ans.add(nums2[i]);
                st.remove(nums2[i]);
            }
        }
        System.out.println(ans);
        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersection(nums1,nums2);

    }
}
