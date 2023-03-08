package com.ynr.Arrays;

public class Matrix_Add {

	public static void main(String[] args) {
      int[][] a1={{10,20,30},
    		      {60,50,65},
    		      {40,50,60}};
      
      int[][] a2={{40,50,60},
    		      {10,20,30},
    		      {9,30,25}};
      int[][] a3=new int[3][3];
      
      for(int i=0;i<a3.length;i++) {
    	  for(int j=0;j<a3.length;j++) {
    		 a3[i][j]= a1[i][j]+a2[i][j];
    	  }
      }
      for(int k=0;k<a3.length;k++) {
    	  for(int l=0;l<a3.length;l++) {
    	  System.out.print(a3[k][l]+",");
    	  }
    	  System.out.println();
      }
      
      
	}

}
