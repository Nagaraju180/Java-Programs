package com.ynr.LeetCode;

import java.util.Arrays;

public class RemoveEle {

	public static void main(String[] args) {
       int[] a= {0,1,2,2,3,0,4,2};
       int val=2;
       System.out.println(removeElement(a,val));
       System.out.println(Arrays.toString(a));
	}
	
	
	    public static int removeElement(int[] nums, int val) {
	    	int c = 0;
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] != val){
	                nums[c] = nums[i];
	                c++;
	                
	            }
	            
	        }
	        
	        return c;

	    }

}
