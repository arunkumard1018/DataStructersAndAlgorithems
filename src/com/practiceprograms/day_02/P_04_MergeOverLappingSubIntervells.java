package com.practiceprograms.day_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Merge Overlapping Sub-intervals
 * Problem Statement: Given an array of intervals,
 * merge all the overlapping intervals and return an array of non-overlapping intervals.
 * Example 1:
 * Input: intervals=[[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] are overlapping we can merge them to form [1,6] intervals.
 *
 *  Example 2:
 * Input: [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Since intervals [1,4] and [4,5] are overlapping we can merge them to form [1,5]
 */
public class P_04_MergeOverLappingSubIntervells {

    /**
     * We will start traversing the given array with a single loop. At the first index,
     * as our answer list is empty, we will insert the first element into the answer list.
     * While traversing afterward we can find two different cases:
     *
     * Case 1: If the current interval can be merged with the last inserted interval of the answer list:
     * In this case, we will update the end of the last inserted interval with the maximum(current interval’s end,
     * last inserted interval’s end) and continue moving afterward.
     *
     * Case 2: If the current interval cannot be merged with the last inserted interval of the answer list:
     * In this case, we will insert the current interval in the answer array as it is. And after this insertion,
     * the last inserted interval of the answer list will obviously be updated to the current interval.
     */
    public static int[][] merge(int[][] intervals) {
        /**
         * First, we will group the closer intervals by sorting
         * the given array of intervals(if it is not already sorted).
         */
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        /**
         * After that, we will start traversing the array using a loop(say i)
         * and insert the first element into our answer list(as the answer list is empty).
         */
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            if(!ans.isEmpty() && intervals[i][0] <= ans.get(ans.size()-1).get(1)){
                int maxi = Integer.max(intervals[i][1],ans.get(ans.size()-1).get(1));
                ans.get(ans.size()-1).set(1,maxi);
            }else{
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
        }
        int[][] result = new int[ans.size()][2];
        for(int i=0; i<ans.size(); i++){
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        com.utility.Arrays.display(merge(intervals));
    }
}
