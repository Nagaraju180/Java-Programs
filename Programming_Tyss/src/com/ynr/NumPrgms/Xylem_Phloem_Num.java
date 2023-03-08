package com.ynr.NumPrgms;

import java.util.Scanner;

public class Xylem_Phloem_Num {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=sc.nextInt();
	      
	      int sumfl=0;
	      int sumrest=0;
	      
	      sumfl=num%10;
	      num/=10;
	      while(num>9) {
	    	  sumrest+=num%10;
	    	  num/=10;
	      }
	      sumfl+=num;
	      if(sumfl==sumrest) System.out.println("Xylem");
	      else System.out.println("Phloem");
	}

}
