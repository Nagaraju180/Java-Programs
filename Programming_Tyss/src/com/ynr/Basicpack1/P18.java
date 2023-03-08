package com.ynr.Basicpack1;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 3 inputs");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      
      
      if(n1==n2 && n2==n3 && n3==n1) {
    	  System.out.println("It is a Equilateral triangle");
      }
      else if(n1==n2 || n2==n3 ||n3==n1) {
    	  System.out.println("It is an Isoceles");
      }
      else {
    	  System.out.println("it is a Scalene");
      }
	}

}
