package com.practiceprograms.day_03;

/**
 * Problem Statement: Given an m*n 2D matrix and an integer, write a program to find if the given integer exists in the matrix.
 *
 * Given matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row
 * Example 1:
 * Input: matrix =
 *              [[1,3,5,7],
 *              [10,11,16,20],
 *              [23,30,34,60]],
 * target = 3
 * Output: true
 * Explanation: As the given integer(target) exists in the given 2D matrix, the function has returned true.
 */
public class SearchInMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0; int high = (matrix.length * matrix[0].length)-1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            int i = mid/matrix[0].length;
            int j = mid%matrix[0].length;
            if(matrix[i][j] == target){
                return true;
            }else if(target < matrix[i][j]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}
