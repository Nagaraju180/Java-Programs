package com.ynr.Arrays;

public class CommonEle {

	public static void main(String[] args) {
        int[] a= {10,20,30,50,20};
    //    int[] b= {60,70,80,10};
        
        for(int i=0;i<a.length;i++) {
        	for(int j=i+1;j<a.length;j++)
        	if(a[i]==a[j]) { 
        		System.out.println(a[i]);
        	}
        	
        }  
	}

}
