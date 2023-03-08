package com.ynr.Methods;

import java.util.Scanner;

public class Merging_arrays {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the size");
//		int x=sc.nextInt();
//	    System.out.println("Enter ele a");
//	    
	    
	    int[] a1= {6,8,3,2};
	   
//	    for(int i=0;i<a1.length;i++) {
//	    	a1[i]=sc.nextInt();
//	    }
	    int[] a2= {4,7,2,};  
	    int[] a3=new int[a1.length+a2.length];
	    
	    int k=0;
	    for(int i=0;i<a3.length;i++) {
	    	if(i<a1.length) {
	    		a3[i]=a1[i];
	    	}
	    	else {
	    		a3[i]=a2[k];
	    		k++;
	    	}
	    }
	    for(int n:a3) {
	    	System.out.println(n);
	    }
    }

}
