package com.ynr.Arrays;

public class Max_Valuein_2dArray {

	public static void main(String[] args) {
		int[][] a={{1,2,3},
		           {4,5,6},
		           {7,8,9}};
		int t=0;
		int max=a[t++][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		System.out.println(max);
	}

}
