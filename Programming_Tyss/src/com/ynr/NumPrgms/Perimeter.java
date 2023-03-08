package com.ynr.NumPrgms;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
          System.out.println("Enter a and b");
          double d=scn.nextDouble();
          
          double perimeter=4*d;
          
          System.out.println("Perimeter of square"+perimeter);
	}

}
