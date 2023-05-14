package com.practiceprograms.day_02;

/**
 * Rotate Image by 90 degree
 * Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.
 * Note: Rotate matrix 90 degrees anticlockwise
 * Example 1:
 * Input: [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.
 */
public class P_03_RotateMatrix {

    /**
     * Intuition: By observation,
     * we see that the first column of the original matrix is the reverse of the first row of the rotated matrix,
     * so that’s why we transpose the matrix and then reverse each row,
     * and since we are making changes in the matrix itself space complexity gets reduced to O(1).
     */
    public static void answer(int[][] arr){
        /**
         * Step 1: Transpose the matrix.
         * (transposing means changing columns to rows and rows to columns)
         */
        findTranspose(arr);

        /**
         * Step 2: Reverse each row of the matrix.
         */
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[0].length-j-1];
                arr[i][arr[0].length-j-1] = temp;
            }
        }
    }

    /**
     * @param arr will find the Transpose of given matrix
     */
    public static void findTranspose(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        com.utility.Arrays.display(arr);
        answer(arr);
        System.out.println("After Execution");
        com.utility.Arrays.display(arr);
    }
}
