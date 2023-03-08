package com.ynr.ArraysAssignment;

public class Second_Largest_ele {

	public static void main(String[] args) {
      int[] a= {9,4,7,2,8,};
      int max=a[0];
      int secmax=a[1];
      
      for(int i=1;i<a.length;i++) {
    	  if(max<a[i]) {
    		  secmax=max;  
    		  max=a[i];
    	  }
    	  else if(secmax<a[i]) {
    		  secmax=a[i];
    	  }
      }
      System.out.println(secmax);
	}
}
