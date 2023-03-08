package com.ynr.ArraysAssignment;

import java.util.Arrays;

public class Removing_duplicates {

	public static void main(String[] args) {
		int[]a= {100,20,300,20,40,500,300};
		
	      for(int i=a.length-1;i>0;i--) {
	    	  for(int j=0;j<i;j++) {
	    		  if(a[j]>a[j+1]) {
	    			 int temp=a[j];
	    			 a[j]=a[j+1];
	    			 a[j+1]=temp;
	    		  }
	    	  }
	      }
	      System.out.println(Arrays.toString(a));
	      
	      int[]b=new int[a.length];
	      int ind=0;
	      
	      for(int i=0;i<a.length-1;i++) {
	    	  if(a[i]!=a[i+1]) {
	    		  b[ind++]=a[i];
	    	  }
	      }
	      System.out.println(Arrays.toString(b));
	}

}
