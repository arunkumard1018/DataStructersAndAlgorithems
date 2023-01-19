package com.tyf;

public class D_02_Arrays {

    /**
     * Problem : P_01 Rotate Matrix by 90 Degrees
     * Given nxn matrix
     * i/p : 1	2  3
     *       4	5  6
     *       7	8  9
     *------------------------------
     * O/p : 7	4  1
     *       8	5  2
     *       9	6  3
     */
    public static void rotateMatrix(int[][] nums){
        /* Transpose of Matrix nums*/
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length/2; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[i][nums.length-1-j];
                nums[i][nums.length-1-j] = temp;
            }
        }
    }



    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        com.utility.Arrays.display(arr);
        System.out.println("After Execution of Brut");
//        com.utility.Arrays.display(D_02_BrutForceSoluns.rotateMatrix(arr));
//        D_02_BrutForceSoluns.TransPoseOfMat(arr);
        D_02_Arrays.rotateMatrix(arr);
        com.utility.Arrays.display(arr);
    }
}


class D_02_BrutForceSoluns{

    /**
     * Brut force Solution : P_01
     */
    public static int[][] rotateMatrix(int[][] nums){
        int len =nums.length;
        int[][] ans = new int[len][len];
        for(int j=0; j<len; j++){
            for(int i=0; i<len; i++){
                ans[j][len-1-i] = nums[i][j];
            }
        }
        return ans;
    }

    /**
     * To Find Transpose of Given Matrix
     * @param nums
     */
    public static void TransPoseOfMat(int[][] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }
}