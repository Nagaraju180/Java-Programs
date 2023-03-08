package com.ynr.Arrays;

import java.util.Scanner;

public class Palindrome_Array {

	public static void main(String[] args) {
		
//	Scanner scn=new Scanner(System.in);
//    System.out.println("Enter a size");
//	   int size=scn.nextInt();
//	   int [] a=new int[size];
//    System.out.println("Enter the array elements");
//    
//	  for(int i=0;i<size;i++){
//		  	a[i]=scn.nextInt();
//	  }
		
		int[] a= {121,234,151};
		for(int i=0;i<a.length;i++){
	    	int n=a[i];
	    	int temp=n;
	    	int rev=0;
		   	 while(n>0){
		   		int rem= n%10;
		    	rev=rev*10+rem;
		    	n/=10;
		     }
		    
		     if(temp==rev) {System.out.println(temp+"is a pallindrome");}
		      else {System.out.println(temp+"is not pallindrome");}
		}
	}

}
