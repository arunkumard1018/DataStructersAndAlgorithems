package com.practiceprograms.day_04;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class P_01_2SumProblem {

    /**
     * Brut force approach O(n^2) TC
     */
    public int[] twoSum(int[] nums, int target) {
        int ans[] = {-1,-1};
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public int[] twoSumSoln2(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = {-1,-1};
        for(int i=0; i<arr.length; i++){
            if(!map.isEmpty() && map.containsKey(arr[i])){
                ans[0] = map.get(arr[i]);
                ans[1] = i;
            }else{
                map.put(target-arr[i],i);
            }
        }
        return ans;
    }
}
