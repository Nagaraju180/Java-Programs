package com.ynr.Arrays;

public class SubArray {

	public static void main(String[] args) {
		int []a= {1,1,2,1,1};
		int possubarray=a.length*(a.length+1)/2;
		System.out.println("Possible Subarrays:"+possubarray);
		
       for(int i=0;i<a.length;i++) {
    	   for(int j=i;j<a.length;j++) {
    		   for(int k=i;k<=j;k++) {
    			   System.out.print(a[k]);
    		   }
    		   System.out.println();
    	   }
       }
	}

}
