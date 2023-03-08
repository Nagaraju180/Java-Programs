package com.ynr.pack2;

import java.util.Scanner;
//Zomato Application
public class Project_1 {
//Using if conditions and Switch cases
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name:");
		String name=sc.next();
		System.out.println("Enter ur email:");
		String email1=sc.next();
		System.out.println("Enter ur number:");
		long phnm=sc.nextLong();
		System.out.println("Enter ur Password:");
		String pwrd1=sc.next();
		System.out.println("Login Successfully>>>>>>)");
		System.out.println("Enter email");
		String email2=sc.next();
		System.out.println("Enter password");
		String pwrd2=sc.next();
		
		if(email1==email2){
				System.out.println("LOGIN SUCCESSFULL");
				System.out.println("1.Amaravathi restraunt");
				System.out.println("Thriveni restraunt");
				System.out.println("Ajantha restraunt");
				System.out.println("Eagle restraunt");
				System.out.println("Choose any one:");
				int res=sc.nextInt();
				  switch(res) {
				case 1: System.out.println("1.MEALS");
				        System.out.println("2.IDLY");
				        System.out.println("3.DOSA");
				        System.out.println("4.CHAPATHI");
				        int dish=sc.nextInt();
				        switch(dish) {
				        case 1:System.out.println("Meals 110/-");
				        break;
				        case 2:System.out.println("Idly 40/-");
				        break;
				        case 3:System.out.println("Dosa 30/-");
				        break;
				        case 4:System.out.println("Chapathi 40/-");
				        break;
				        }
				        break;
				case 2: System.out.println("1.MEALS");
		                System.out.println("1.CHICKEN BIRIYANI");
		                System.out.println("1.MOTTON BIRIYANI");
		                System.out.println("1.MASHROOM BIRIYANI");
		                break;
				case 3: System.out.println("1.BURGER");
                        System.out.println("1.PIZZA");
                        System.out.println("1.SPRING ROLLS");
                        System.out.println("1.CHICKEN WINGS");
                        break;
				case 4: System.out.println("1.");
                        System.out.println("1.");
                        System.out.println("1.");
                        System.out.println("1.");
                        break;
				  }
			}else {
				System.out.println("LOGIN FAILED!!!");
			}
		
	}

}
