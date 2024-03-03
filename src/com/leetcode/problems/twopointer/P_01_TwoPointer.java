package com.leetcode.problems.twopointer;
class P_01_TwoPointer_Solution {

    public int strStr(String haystack, String needle) {
        int j=0;
        for(int i=0;i<haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                j=0;
                while(i<haystack.length() && j<needle.length()
                        && haystack.charAt(i) == needle.charAt(j)){
                    i++;
                    j++;
                }
                if(haystack.charAt(i-1) == needle.charAt(needle.length()-1) && j==needle.length()) return i-needle.length();
            }
            i++;
        }
        return -1;
    }
}
public class P_01_TwoPointer {
    public static void main(String[] args) {
        System.out.println(new P_01_TwoPointer_Solution().strStr("mississippi","issi"));
    }
}
