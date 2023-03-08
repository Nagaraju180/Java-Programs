package com.ynr.Basicpack1;

import java.util.Scanner;
 //5
public class P24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Money:");
	      int money=sc.nextInt();
	      System.out.println("Enter noOfBikes:");
	      int bikes=sc.nextInt();
	      
	      if(money>60000) {
	    	  if(bikes==1) {
	    		  System.out.println("Money is Sufficient to buy bike");
	    	  }else {
	    		  System.out.println("Not sufficient");
	    	  }
	      }else {
	    	  System.out.println("Take loan from bank to buy");
	      }
	}

}
