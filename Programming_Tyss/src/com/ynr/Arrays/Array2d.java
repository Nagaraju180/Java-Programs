package com.ynr.Arrays;

import java.util.Scanner;

public class Array2d {
//Character
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Rows nd columns");
	      int row=sc.nextInt();
	      int col=sc.nextInt();
	      
	      char[][] a=new char[row][col];
	      
	      
	      
	      for(int i=0;i<a.length;i++) {
	    	  System.out.println("Enter elements in row no"+(i+1));
	    	  for(int j=0;j<a[i].length;j++) {
	    		  a[i][j]=sc.next().charAt(0);
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
