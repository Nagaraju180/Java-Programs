package com.ynr.NumPrgms;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter the length");
       int a=scn.nextInt();
       System.out.println("Enter breadth");
       int b=scn.nextInt();
       
       double area=a*b;
       double perimeter=2*a+b;
       System.out.println("Area of Rectangle"+area);
	}

}
