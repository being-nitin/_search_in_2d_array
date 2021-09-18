package com.nitincodes;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[][] arr = {
            {23,34,45,56},
            {1,3,5,7},
            {10,20,30,40},
            {21,31,41,51}
	};
    int target = 30;
    int[] ans = searcchh(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searcchh(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-2};
    }
}
