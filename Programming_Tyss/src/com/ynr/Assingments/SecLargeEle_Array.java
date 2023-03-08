package com.ynr.Assingments;

public class SecLargeEle_Array {

	public static void main(String[] args) {
       int[]a= {40,2,8,3,9,5};
       int max=a[0];
       int secmax=a[1];
       
       for(int i=1;i<a.length;i++) {
    	   if(max<a[i]) {
    		   secmax=max;
    		   max=a[i];
    	   }
    	   else if(secmax<a[i]) {
    		   secmax=a[i];
    	   }
       }
       System.out.println(secmax);
	}

}
