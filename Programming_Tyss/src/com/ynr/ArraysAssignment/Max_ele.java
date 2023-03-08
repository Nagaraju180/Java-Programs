package com.ynr.ArraysAssignment;

public class Max_ele {

	public static void main(String[] args) {
      int[] a= {10,2,9,4,5,6,7};
      
      int max=a[0];
      
      for(int i=1;i<a.length;i++) {
    	  if(a[i]>max) {
    		  max=a[i];
    	  }
      }
      System.out.println(max);
	}

}
