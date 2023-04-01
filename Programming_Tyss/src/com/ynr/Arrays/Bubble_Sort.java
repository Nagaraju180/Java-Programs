package com.ynr.Arrays;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
       int[] a= {5,4,3,2,1};
       sort(a);
       
       for(int n:a) {
    	   System.out.println(n);
       }
	}
	
	 public static void sort(int[]arr) {
  	   for(int i=0;i<arr.length;i++) {
  		   for(int j=i+1;j<arr.length;j++) {
  			   if(arr[i]>arr[j]) {
  				  /*? arr[i]=arr[i]+arr[j];
  				   arr[j]=arr[i]-arr[j];
  				   arr[i]=arr[i]-arr[j];*/			   
  				   int temp=arr[i];
  				   arr[i]=arr[j];
  				   arr[j]=temp;
  			   }
  		   System.out.println(Arrays.toString(arr));
  		   }
  	   }
	 }
}
