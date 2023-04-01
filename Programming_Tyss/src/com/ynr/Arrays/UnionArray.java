package com.ynr.Arrays;

public class UnionArray {

	public static void main(String[] args) {
       int[] a= {9,3,1,6};
       int[] b= {1,2,3,4};
       int a1=a.length;
       int b1=b.length;
       int sum=a1+b1;
       int count=0;
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<b.length;j++) {
    		   if(a[i]==b[j]) {
    			   count++;
    		   }
    	   }
       }
       System.out.println(count);
       System.out.println("Union Ele Count-->"+(sum-count));	   
	}

}
