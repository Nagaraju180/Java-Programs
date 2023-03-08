package com.ynr.Basicpack1;

import java.util.Scanner;

public class AirTicketBooking {
//3
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("Available classes:");
	       System.out.println("1.Business class");
	       System.out.println("2.Economical class");
	       System.out.println("3.Luxury class");
	       System.out.println("Enter ur choice?");   
	       int num=sc.nextInt();
	       switch(num) {
	       case 1: System.out.println("Your Choosen Business class");
	       break;
	       case 2: System.out.println("Your Choosen Economical class");
	       break;
	       case 3: System.out.println("Your Choosen Luxury class");
	       break;
	       default:System.out.println("Choose available classes!");
	       }
	}

}
