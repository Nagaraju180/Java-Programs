package com.ynr.Basicpack1;

import java.util.Scanner;

public class P49 {
//3.
	public static void main(String[] args) {
				System.out.println("Enter quantity of T-shirts: ");
			      Scanner sc = new Scanner(System.in);
			      int  n = sc.nextInt();
				   
			      int cost=n*200;
			      int disc=cost*10/100;
			      float amount=cost-disc;
			      
			      if(cost>=1000) {
			    	 
			    	  System.out.println("cost of t-shirts with discount:"+amount);
			      }
			      else {
			    	  System.out.println("cost of t-shirts:"+cost);
			      }

			

		
	}

}
