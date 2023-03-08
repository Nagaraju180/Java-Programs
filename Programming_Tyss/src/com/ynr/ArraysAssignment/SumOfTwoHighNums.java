package com.ynr.ArraysAssignment;

public class SumOfTwoHighNums {
   public static void main(String[] args) {
	   int[] a= {9,4,7,2,8,};
	   
	   int sum=a[0]+a[1];
	   
	   for(int i=0;i<a.length;i++) {
		   for(int j=i+1;j<a.length;j++) {
			   if(a[i]+a[j]>sum) {
				   sum=a[i]+a[j];
			   }
		   }
	   }
	   System.out.println(sum);
   }
}
