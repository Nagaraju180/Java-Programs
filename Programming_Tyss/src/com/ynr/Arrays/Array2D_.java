package com.ynr.Arrays;

import java.util.Scanner;

public class Array2D_ {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Rows nd columns");
      int row=sc.nextInt();
      int col=sc.nextInt();
      
      double[][] a=new double[row][col];
      
      
      
      for(int i=0;i<a.length;i++) {
    	  System.out.println("Enter elements in row no"+(i+1));
    	  for(int j=0;j<a[i].length;j++) {
    		  a[i][j]=sc.nextDouble();
    	  }
      }
      
      for(int i=0;i<a.length;i++) {
    	  for(int j=0;j<a[i].length;j++) {
    		  System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
	}

}
