package com.ynr.Arrays;

public class MaxNuminCol_2D {

	public static void main(String[] args) {
      int[][] a= {{1,2,3},
    		      {4,5,6},
    		      {7,8,9}};
      
      for(int i=0;i<a.length;i++) {
    	 int  max=a[i][0];
    	  for(int j=0;j<a[i].length;j++) {
    		  if(a[j][i]>max) {
    			  max=a[j][i];
    		  }  
    	  }
    	  System.out.print(max);
    	  
      }
      System.out.println();
    		  
	}

}
