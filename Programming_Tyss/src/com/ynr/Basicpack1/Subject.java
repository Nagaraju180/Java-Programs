package com.ynr.Basicpack1;

import java.util.Scanner;
//2
public class Subject {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Available subjects:");
       System.out.println("1.English");
       System.out.println("2.Telugu");
       System.out.println("3.Kannada");
       System.out.println("4.Sanskrit");
       System.out.println("Enter your choice:");
       int num=sc.nextInt();
       switch(num) {
       case 1: System.out.println("Your choosen English as ur 1st lang all the best");
       break;
       case 2: System.out.println("Your choosen Telugu as ur 1st lang all the best");
       break;
       case 3: System.out.println("Your choosen Kannada as ur 1st lang all the best");
       break;
       case 4: System.out.println("Your choosen Sanskrit as ur 1st lang all the best");
       break;
       default:System.out.println("Enter valid choice!!");
       }
       
	}

}
