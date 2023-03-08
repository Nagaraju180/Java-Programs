package com.ynr.Basicpack1;

public class P35 {
//2.sum of 1st 10 even numbers
	public static void main(String[] args) {
		int i=2;
		int sum=0;
       do {
    	  if(i%2==0) {
    		  sum+=i;
    	  }
    	  i++;    	   
       }while(i<=10);
       System.out.println(sum);
	}

}
