package com.ynr.Basicpack1;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a player runs:");
	      int runs=scn.nextInt();
	      
	      if(runs>1 && runs<=25) {
	    	  System.out.println("Bad perfamence");
	      }
	      else if(runs>25 && runs<50) {
	    	  System.out.println("Good performence");
	      }
	      else if(runs>=50 && runs<=80) {
	    	  System.out.println("Very good performance");
	      }
	      else if(runs > 80){
	    	  System.out.println("Amazing performances");
	      }
	      else
	      {
	    	  System.out.println("Invalid data");
	    	  
	      }
	}

}
