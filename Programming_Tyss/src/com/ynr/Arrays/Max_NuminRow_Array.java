package com.ynr.Arrays;

public class Max_NuminRow_Array {
//max number in each row
	public static void main(String[] args) {
		int[][] a={{1,2,3},
		           {4,5,2},
		           {7,8,9}};
		for(int i=0;i<a.length;i++) {
			int max=a[i][0];
			for(int j=0;j<a.length;j++) {
				if(a[i][j]>max)
					max=a[i][j];
			}
			System.out.println(max);
		}
	}

}
