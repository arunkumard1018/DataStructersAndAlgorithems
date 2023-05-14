package com.practiceprograms.day_02;

/**
 * next_permutation : find next lexicographically greater permutation
 * Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.
 * If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
 * Example 1 :
 * Input format: Arr[] = {1,3,2}
 * Output: Arr[] = {2,1,3}
 * Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}.
 * So, the next permutation just after {1,3,2} is {2,1,3}.
 */
public class P_02_Next_Permutation {

    public static void answer(int[] arr){
        int index = arr.length;

        /**
         * Find the break-point, i: Break-point means the first index i from the back of the given array where arr[i] becomes smaller than arr[i+1].
         * For example, if the given array is {2,1,5,4,3,0,0}, the break-point will be index 1(0-based indexing).
         * Here from the back of the array, index 1 is the first index where arr[1] i.e. 1 is smaller than arr[i+1] i.e. 5.
         * To find the break-point, using a loop we will traverse the array backward and store the index i where arr[i]
         * is less than the value at index (i+1) i.e. arr[i+1].
         */
        for(int i=index-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        /**
         * if such a break-point does not exist i.e. if the array is sorted in decreasing order,
         * the given permutation is the last one in the sorted order of all possible permutations.
         * So, the next permutation must be the first i.e. the permutation in increasing order.
         * So, in this case, we will reverse the whole array and will return it as our answer.
         */
        if(index<0){
            reverse(arr,0,arr.length-1);
            return;
        }

        /**
         * If a break-point exists:
         * Find the smallest number i.e. > arr[i] and in the right half of index i(i.e. from index i+1 to n-1)
         * and swap it with arr[i].
         */
        for (int i=arr.length-1; i>index; i--){
            if(arr[i] > arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        /**
         * Reverse the entire right half(i.e. from index i+1 to n-1) of index i.
         * And finally, return the array.
         */
        reverse(arr,index+1,arr.length-1);
    }

    /**
     * @param arr
     * @param start
     * @param end
     * will reverse the array from given start point to end point
     */
    public static void reverse(int[] arr,int start,int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        answer(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
