package com.zrandom.Arrays;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class SetMatrixZeros {
    public static void SetZeros(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        boolean firstRowHasZero = false, firstColHasZero = false;

        for(int i=0; i< row; i++){
            if(arr[i][0] == 0){
                firstColHasZero = true;
                break;
            }
        }
        for(int j=0; j<col; j++){
            if(arr[0][j] == 0){
                firstRowHasZero = true;
                break;
            }
        }
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(arr[i][j] == 0){
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        for(int i=1; i<row; i++){
            if(arr[i][0] == 0)
                nullifyRow(i,arr);
        }
        for(int j=1; j<col; j++){
            if(arr[0][j] == 0)
                nullifyColumn(j,arr);
        }
        if(firstColHasZero) nullifyColumn(0,arr);
        if(firstRowHasZero) nullifyRow(0,arr);
    }
    public static void nullifyRow(int i, int[][] arr){
        for(int j=1; j<arr[0].length; j++){
            arr[i][j] = 0;
        }
    }
    public static void nullifyColumn(int j, int[][] arr){
        for(int i=1; i<arr.length; i++){
            arr[i][j] = 0;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{0,2,3,4},{1,3,5,1},{1,2,0,5},{1,2,3,4}};
        com.utility.Arrays.display(arr);
        System.out.println("After Execution \n\n");
        SetZeros(arr);
        com.utility.Arrays.display(arr);
    }
}
