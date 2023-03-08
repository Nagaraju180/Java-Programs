package com.ynr.Basicpack1;

import java.util.Scanner;

public class P47 {
//1.checking square are not
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter length and breadth");
      int len=sc.nextInt();
      int bre=sc.nextInt();
      
      if(len==bre) {
    	  System.out.println("It is a square");
      }else {
    	  System.out.println("It is not a square");
      }
	}

}
