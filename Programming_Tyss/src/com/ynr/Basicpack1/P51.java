package com.ynr.Basicpack1;

import java.util.Scanner;

public class P51 {
//5.Finding oldest and youngest among three peoples

			public static void main(String[] args) {
		         
				Scanner scn=new Scanner(System.in);
				
				System.out.println("Enter age of the First Person");
				int age1=scn.nextInt();
				
				System.out.println("Enter age of the Second Person");
				int age2=scn.nextInt();
				
				System.out.println("Enter age of the Third Person");
				int age3=scn.nextInt();
				
				if(age1>age2 && age1>age3)
				{
					System.out.println("First person is the Oldest");
				}
				
				else if(age2>age3 && age2>age1)
				{
					System.out.println("Second person is the Oldest");
				}
				
				else if(age3>age1 && age3>age2)
				{
					System.out.println("Third person is the Oldest");
				}
				
				else System.out.println("All are equal");
				
				
				if(age1<age2 && age1<age3)
				{
					System.out.println("First person is the Youngest");
				}
				
				else if(age2<age3 && age2<age1)
				{ 
					System.out.println("Second person is the Youngest");
				}
				
				else if(age3<age1 && age3<age2)
				{
					System.out.println("Third person is the Youngest");
				}
				
			}

		
		
	}

