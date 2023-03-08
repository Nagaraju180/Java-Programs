package com.ynr.Assingments;

public class InsertEle_Array {

	public static void main(String[] args) {
		int[]a= {4,2,8,3,9,5};
		int[]a1=new int[a.length+1];
		int num=50;
		int ind=2;
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(i==ind) {
				a1[j]=num;
				j++;
			}
			a1[j]=a[i];
			j++;
		}
		
		for(int k=0;k<a1.length;k++) {
			System.out.println(a1[k]);
		}
	}

}
