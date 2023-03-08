package com.ynr.Arrays;

public class Matrix_Sub {

	public static void main(String[] args) {
		  int[][] a1={{70,80,90},
				      {40,50,60},
				      {70,80,90}};
		  
	      int[][] a2={{10,15,40},
	    		      {30,25,30},
	    		      {24,46,45}};
	      int[][] a3=new int[3][3];
	      
	      for(int i=0;i<a1.length;i++) {
	    	  for(int j=0;j<a2[i].length;j++) {
	    		 a3[i][j]= a1[i][j]-a2[i][j];
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
