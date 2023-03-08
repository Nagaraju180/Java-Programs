package com.ynr.Basicpack1;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your Maths marks");
      int math=sc.nextInt();
      System.out.println("Enter your Physics marks");
      int phys=sc.nextInt();
      System.out.println("Enter your Chemistry marks");
      int chem=sc.nextInt();
      System.out.println("Enter your English marks");
      int eng=sc.nextInt();
      System.out.println("Enter your java marks");
      int java=sc.nextInt();
      
      int per1=math/100*100;
      int per2=phys/100*100;
      int per3=chem/100*100;
      int per4=eng/100*100;
      int per5=java/100*100;
      
	}

}
