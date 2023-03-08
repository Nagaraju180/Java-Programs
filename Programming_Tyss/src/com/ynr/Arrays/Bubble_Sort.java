package com.ynr.Arrays; 

public class Bubble_Sort {

	public static void main(String[] args) {
       int[] a= {4,2,6,3,7};
       sort(a);
       
       for(int n:a) {
    	   System.out.println(n);
       }
	}
	
	 public static void sort(int[]arr) {
  	   for(int i=0;i<arr.length;i++) {
  		   for(int j=i+1;j<arr.length-1;j++) {
  			   if(arr[i]>arr[j]) {
  				   int temp=arr[i];
  				   arr[i]=arr[j];
  				   arr[j]=temp;
  			   }
  		   }
  	   }
	 }
}
