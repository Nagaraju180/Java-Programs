package com.ynr.ArraysAssignment;

public class Second_Largest_ele {

	public static void main(String[] args) {
      int[] a= {4,7,2,9,8,80};
      int max=a[0];
      int secmax=a[1];
      
      for(int i=1;i<a.length;i++) {
    	  if(max != a[i])
    	  {
    		  if(a[i]>max) {
        		  secmax=max;  
        		  max=a[i];
        	  }
        	  else if(a[i]>secmax) {
        		  secmax=a[i];
        	  }
    	  }
    	  
    	 
      }
      System.out.println(secmax);
	}
}
