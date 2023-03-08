package com.ynr.Methods;

public class Greatest_Element {

	public static void main(String[] args) {
       int[] a= {10,60,40,20,80,50,100};
       int max=a[0];
       
       for(int i=0;i<a.length;i++) {
    	   if(a[i]>a[0]) {
    		   a[0]=a[i];
    	   }
       }
       System.out.println(a[0]);
	}

}
