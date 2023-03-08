package com.ynr.Arrays;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a num");
	       int [] a=new int[9];
	       
	       for(int r=0;r<a.length;r++) {
	    	   a[r]=sc.nextInt();
	       }
	       int pro=1;
	       for(int i=0;i<a.length;i++) {
	    	   if(i%2==0) {
	    		  pro=pro*a[i];
	    	   }
	       }
	       System.out.println(pro);
	}

}
