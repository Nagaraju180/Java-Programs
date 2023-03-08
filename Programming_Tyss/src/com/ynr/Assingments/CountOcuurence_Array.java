package com.ynr.Assingments;

public class CountOcuurence_Array {

	public static void main(String[] args) {
		int[]a= {4,2,8,3,8,5,8};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
