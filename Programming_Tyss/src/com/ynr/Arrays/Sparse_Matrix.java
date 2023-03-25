package com.ynr.Arrays;

public class Sparse_Matrix {

	public static void main(String[] args) {
		int[][] a= {{1,0,3},
				    {0,0,4},
				    {7,0,0}};
		int count0=0;
		int count1=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]==0) 
					count0++;
				if(a[i][j]!=0)
					count1++;
			}
		}
		if(count0>count1) 
			System.out.println("It is Sparse matrix");
		else
			System.out.println("It is not Sparse matrix");
	}

}
