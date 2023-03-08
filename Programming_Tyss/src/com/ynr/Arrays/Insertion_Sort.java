package com.ynr.Arrays;

import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Array size");
      int size=sc.nextInt();
      int[] a=new int[size];
      
      System.out.println("Enter elements");
      
      for(int r=0;r<a.length;r++) {
    	  int num=sc.nextInt();
      }
      int ele=100;
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a.length;j++) {
    		  if(a[j]==a[2]) a[2]=ele;
    	  }
      }
      for(int n:a) {
    	  System.out.println(n);
      }
	}

}
