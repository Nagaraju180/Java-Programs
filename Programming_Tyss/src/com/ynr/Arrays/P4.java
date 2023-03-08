package com.ynr.Arrays;

public class P4 {
//cube of elements in an array
	public static void main(String[] args) {
		 int[] a=new int[5];
	      
	      a[0]=1;
	      a[1]=2;
	      a[2]=3;
	      a[3]=4;
	      a[4]=5;
	      int cube=0;
	      for(int i=0;i<a.length;i++) {
	    	  cube= a[i]*a[i]*a[i];
	      }
	      System.out.println(cube);
	}

}
