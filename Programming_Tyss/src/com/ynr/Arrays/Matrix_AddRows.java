package com.ynr.Arrays;

public class Matrix_AddRows {

	public static void main(String[] args) {
		int[][] a1={{1,2,3},
			        {4,5,6},
			        {7,8,9}};
	 
        int[] a3=new int[3];
     
        for(int i=0;i<a1.length;i++) {
   	       for(int j=0;j<a1[i].length;j++) {
   		      a3[i]+= a1[i][j];
   	       }
        }
         for(int k=0;k<a3.length;k++) {
   	       System.out.println(a3[k]+",");  
         }
	}

}
