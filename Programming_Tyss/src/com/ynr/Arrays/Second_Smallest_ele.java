package com.ynr.Arrays;

public class Second_Smallest_ele {

	public static void main(String[] args) {
		 int[] a= {9,4,7,2,8,};
	      int small=a[0];
	      int secsml=a[1];
	      
	      for(int i=1;i<a.length;i++) {
	    	  if(a[i]<small) {
	    		  secsml=small;  
	    		  small=a[i];
	    	  }
	    	  else if(a[i]<secsml) {
	    		  secsml=a[i];
	    	  }
	      }
	      System.out.println(secsml);
	}

}
