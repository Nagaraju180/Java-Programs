package com.ynr.Basicpack1;

public class P26 {
//deleting numbers and counting
	public static void main(String[] args) {
		int num=2456;
		int count=0;
       while(num>0) {
    	   num/=10;
    	   count++;
       }
       System.out.println(count);
	}

}
