package com.zrandom.Arrays;

public class SetMatZeros {
    public void nullifyCol(int[][] arr,int j){
        for(int i=0; i<arr.length; i++)
            arr[i][j] = 0;
    }
    public void nullifyRow(int[][] arr,int i){
        for(int j=0; j<arr[0].length; j++)
            arr[i][j] = 0;
    }

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;



        for(int j=0; j<col; j++){
            if(matrix[0][j] == 0)
                firstRowHasZero = true;
        }
        for(int i=0; i<row; i++){
            if(matrix[i][0] == 0){
                firstColHasZero = true;
            }
        }

        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i=1; i<row; i++){
            if(matrix[i][0] == 0)
                nullifyRow(matrix,i);
        }
        for(int j=1; j<col; j++){
            if(matrix[0][j] == 0)
                nullifyCol(matrix,j);
        }
        if(firstRowHasZero) nullifyRow(matrix,0);
        if(firstColHasZero) nullifyCol(matrix,0);
    }

}
