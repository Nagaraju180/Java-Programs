package com.ynr.Arrays;

public class P3 {
//average of elements of an array
	public static void main(String[] args) {
		 int[] a=new int[5];
	      
	      a[0]=10;
	      a[1]=20;
	      a[2]=30;
	      a[3]=40;
	      a[4]=50;
	      
	      int avg=1;
	      for(int i=1;i<a.length;i++) {
	    	  avg+=(a[i])/5;
	      }
	      System.out.println(avg);
	}

}
