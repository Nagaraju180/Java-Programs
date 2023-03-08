package com.ynr.Arrays;

public class P2 {
//product of elements in an array
	public static void main(String[] args) {
		 int[] a=new int[5];
	      
	      a[0]=1;
	      a[1]=2;
	      a[2]=3;
	      a[3]=4;
	      a[4]=5;
	      
	      int pro=1;
	      
	      for(int i=1;i<a.length;i++) {
	    	  pro=pro*a[i];
	      }
	      System.out.println(pro);
	}

}
