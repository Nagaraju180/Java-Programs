package com.ynr.Arrays;

public class Identity_Matrix {

	public static void main(String[] args) {
		int[][] a= {{1,0,0},
					{0,1,0},
					{0,0,1}};
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j&&a[i][j]==1) {
					flag=true;
				}
				else if(a[i][j]!=0) {
					flag=false;
					break;
				}
			}
		}
		if(flag==true) 
			System.out.println("Identity");
		else
			System.out.println("not identity");
        
        
	}

}
