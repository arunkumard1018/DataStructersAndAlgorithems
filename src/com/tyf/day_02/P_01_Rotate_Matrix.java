package com.tyf.day_02;


class Solution_01{
    /**
     * Brut Force Approach Take another Array nxn and Copy First Row of Given array to last
     * column of dummy array and so on 2 row with 2nd last col and so on
     * NOTE : Assuming Given Matrix will be NxN
     * T.C : O(MxN) S.C : O(MxN)
     */
    public static int[][] ans_01(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        System.out.println(row+" "+col);
        int[][] ans = new int[row][col];

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                ans[j][col-i-1] = arr[i][j];
            }
        }
        return ans;
    }

    public static void answer_02(int[][] arr){

    }
}
public class P_01_Rotate_Matrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        com.utility.Arrays.display(arr);
        System.out.println("After Execution : \n");
        com.utility.Arrays.display(Solution_01.ans_01(arr));
    }
}
