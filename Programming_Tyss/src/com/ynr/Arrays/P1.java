package com.ynr.Arrays;

import java.util.Scanner;

public class P1 {
//Create an array of double type and print it
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nums");
		double n1=sc.nextInt();
		double n2=sc.nextInt();
		double n3=sc.nextInt();
		double n4=sc.nextInt();
		double n5=sc.nextInt();
      double[] d=new double[5];
      
      d[0]=n1;
      d[1]=n2;
      d[2]=n3;
      d[3]=n4;
      d[4]=n5;
      for(double n:d) {
      System.out.println(n);
      }
      
	}

}
