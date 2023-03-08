package com.ynr.Arrays;

public class Matrix_Multi {

	public static void main(String[] args) {
      int[][] a1= {{1,2,3},
    		       {4,5,6},
    		       {7,8,9}};
      int[][] a2={{1,2,3},
		          {4,5,6},
		          {7,8,9}};
     	
      int [][] multi = new int [3][3];
      
      		for(int i=0 ; i < a1.length; i++) {
      			for(int j = 0 ; j < a2.length ; j++) {
      				for(int k=0;k<a2.length;k++) {
      				   multi [i][j] += a1[i][k]*a2[k][j];
      				}
      			}
      		}
      		
      		for(int i=0;i<a1.length;i++) {
      			for(int j=0;j<a2.length;j++)
      			{
      				System.out.print(multi[i][j]+" ");
      			}
      			System.out.println();
      		}
	}

}
