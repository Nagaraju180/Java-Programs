package com.ynr.Basicpack1;

//33 to 38 Do While loops

public class P33 {
//product of 1st 5 natural numbers
	public static void main(String[] args) {
       int i=1;
       int product=1;
       do{
    	  product=product*i;
    	  i++;
       }while(i<=5);
       System.out.println(product);
	}

}
