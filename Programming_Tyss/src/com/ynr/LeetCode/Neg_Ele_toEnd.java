package com.ynr.LeetCode;

import java.util.Arrays;

public class Neg_Ele_toEnd {

	public static void main(String[] args) {
		int[] arr= {-3,5,1,-6,-2,8,4};
		int n=arr.length;
		int [] b=new int[n];
        int j=0;
        // Your code goes here
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                b[j]=arr[i];
                j++;
            }
        }
        for(int k=0;k<n;k++){
            if(arr[k]<0){
                b[j]=arr[k];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
	}

}
