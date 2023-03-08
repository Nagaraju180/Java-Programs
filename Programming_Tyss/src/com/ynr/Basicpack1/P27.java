package com.ynr.Basicpack1;

public class P27 {
//Sum of all the numbers
	public static void main(String[] args) {
         int num=5689;
         int sum=0;
         while(num>0) {
        	int rem=num%10;
        	sum+=rem;
        	 num/=10;
         }
         System.out.println(sum);
	}

}
