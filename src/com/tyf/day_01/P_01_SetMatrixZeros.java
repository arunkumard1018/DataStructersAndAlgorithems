package com.tyf.day_01;

class Solution_P_01 {

    /** Solution_01 Brut Force approach TC O(n^2) **/
    public static void answer_01(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 0){
                    setMinusOne(arr,i,j);
                }
            }
        }
        /* Replacing -1 with Zero*/
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == -1)
                    arr[i][j] = 0;
            }
        }
    }
    /* Setting -1 for non Zero elements for row and column containing Zero*/
    public static void setMinusOne(int[][] arr,int row,int col){
        /* Setting -1 for The Respective column*/
        for(int i=0; i<arr.length; i++){
            if(arr[i][col] != 0){
                arr[i][col] = -1;
            }
        }
        /* Setting -1 for the respective Row*/
        for(int j=0; j<arr[0].length; j++){
            if(arr[row][j] != 0){
                arr[row][j] = -1;
            }
        }
    }

    /** Solution_02 Optimized approach T.C: O(m*n) and S.C: 0(m+n) **/
    public static void answer_02(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        boolean[] rowContainsZero = new boolean[row];
        boolean[] colContainsZero = new boolean[col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == 0){
                    rowContainsZero[i] = true;
                    colContainsZero[j] = true;
                }
            }
        }
        for(int i=0; i<row; i++){
            if(rowContainsZero[i])
                nullifyRow(arr,i);
        }
        for(int j=0; j<col; j++){
            if(colContainsZero[j])
                nullifyCol(arr,j);
        }
    }

    /** Solution_03 Most Optimized Approach.
     *  Using First Row and Column itself instead of Extra Space
     * T.C: O(MxN) S.C: O(1)
    **/
    public static void answer_03(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        boolean firstRowContainsZero = false;
        boolean firstColContainsZero = false;

        /* Checking First col contains Zero*/
        for(int i=0; i<row; i++){
            if(arr[i][0] == 0){
                firstColContainsZero = true;
                break;
            }
        }
        /* Checking First Row Contains Zero */
        for(int j=0; j<col; j++){
            if(arr[0][j] == 0){
                firstRowContainsZero = true;
                break;
            }
        }
        /** Checking for Remaining Rows and cols for Zero if Zero Present
         * making the respective first Row and col to Zero
         */
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        for (int j=1; j<col; j++){
            if(arr[0][j] == 0)
                nullifyCol(arr,j);
        }
        for (int i=1; i<row; i++){
            if(arr[i][0] == 0)
                nullifyRow(arr,i);
        }
        if(firstRowContainsZero)
            nullifyRow(arr,0);
        if(firstColContainsZero)
            nullifyCol(arr,0);
    }

    public static void nullifyRow(int[][] arr, int row){
        for(int col=0; col<arr[0].length; col++){
            arr[row][col] = 0;
        }
    }
    public static void nullifyCol(int[][] arr,int col){
        for(int row=0; row<arr.length; row++){
            arr[row][col] = 0;
        }
    }


}
public class P_01_SetMatrixZeros {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,0,6},{7,8,9}};
        com.utility.Arrays.display(arr);

//        Solution.answer_01(arr);
//        System.out.println("After Execution of The Brut force Solution :");

//        Solution.answer_02(arr);
//        System.out.println("After The Execution Solution_02 :");

        Solution_P_01.answer_03(arr);
        System.out.println("After The Execution of Solution_03 :");

        com.utility.Arrays.display(arr);

    }
}
