package com.ynr.Basicpack1;

import java.util.Arrays;

public class LeetCode {
	    public static int[] twoSum(int[] nums, int target) {
	        int[] a=new int[2];
	            int k=0;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	              int sum=nums[i]+nums[j];
	                if(sum==target){
	                 a[k]=i;
	                 k++;
	                 a[k]=j;
	                }

	            }
	        }
	        return a;
	    }
	    
	    public static void main(String[] args) {
			int[]a= {2,7,5,11};
			System.out.println(Arrays.toString(twoSum(a,9)));
		}

}
