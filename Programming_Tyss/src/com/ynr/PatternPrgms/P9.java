package com.ynr.PatternPrgms;

public class P9 {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
	    	  for(int c=1;c<=r;c++) {
	    		  if(c%2==0) System.out.print(" 0 ");
	    		  else System.out.print(" 1 ");
	    	  }
	    	  System.out.println();
	      }
	}

}
