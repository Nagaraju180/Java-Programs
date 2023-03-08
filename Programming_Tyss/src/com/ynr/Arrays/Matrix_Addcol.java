package com.ynr.Arrays;

public class Matrix_Addcol {

	public static void main(String[] args) {
		 int[][] a1={{1,2,3},
		             {4,5,6},
		             {7,8,9}};
 
          int[] a2=new int[3];
  
         for(int i=0;i<a1.length;i++) {
	       for(int j=0;j<a1[i].length;j++) {
		      a2[i]+= a1[j][i];
	       }
         }
          for(int k=0;k<a2.length;k++) {
	        System.out.print(a2[k]+",");  
          }
	}

}
