package com.ynr.Arrays;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Rows & coloumns");
      int row=sc.nextInt();
      int col=sc.nextInt();
      int[][] arr=new int[row][col];
      
      for(int i=0;i<arr.length;i++) {
    	  System.out.println("Enter values for row:"+(i+1) );
    	  for(int j=0;j<arr[i].length;j++) {
    		  arr[i][j]=sc.nextInt();
    	  }
      }
      
      for(int k=0;k<arr.length;k++) {
    	  for(int l=0;l<arr[k].length;l++) {
    	  System.out.print(arr[k][l]+",");
    	  }
    	  System.out.println();
      }
      
	}

}
