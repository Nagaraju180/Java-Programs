package com.ynr.LeetCode;

public class RemoveDuplicates {

	public static void main(String[] args) {
     int[] nums= {1,1,1,2,2,3};
     removeDuplicates(nums);
     for(int n:nums) {
    	 System.out.print(n+" ");
     }
	}
	
		 public static int removeDuplicates(int[] nums) {
		      int k=1;
				for(int i=0;i<nums.length;i++){
		            if(nums[i] < nums[i+1]) {
		                nums[k++]=nums[i+1];
		            }
		        }
		        return k;
		    }
	

}
