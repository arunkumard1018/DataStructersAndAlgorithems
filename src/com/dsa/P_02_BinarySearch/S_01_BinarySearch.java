package com.dsa.P_02_BinarySearch;

public class S_01_BinarySearch {
    public static int[] binarySearch(int[] arr,int key){
        int low = 0,mid = 0,high = arr.length;
        while(low<high){
            mid = (low+high)/2;
            if(key == arr[mid]) return new int[]{mid};
            if(key < arr[mid]) high = mid-1;
            else low = mid+1;
        }
        return new int[]{low,mid,high};
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12};
        for(int i : binarySearch(arr,1)){
            System.out.print(i+" ");
        }
    }
}
