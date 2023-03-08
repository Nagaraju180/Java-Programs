package com.ynr.Basicpack1;

import java.util.Scanner;

public class P53 {
	//8.Employee place of service
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur age");
		int age=sc.nextInt();
		System.out.println("Enter gender M/F");
		char gen=sc.next().charAt(0);
		System.out.println("Enter maritial Status Y/N");
		char mrg=sc.next().charAt(0);
		
		if(gen=='m'||(age>=20 && age<=40)) { 
			System.out.println("You will work in any where");
		}else if(gen=='m'||(age>=40 && age<=60)) { 
			System.out.println("You are work in only urban areas only");
		}else if(gen=='f'){
			 System.out.println("You are women you will work only in urban areas");
		}else {
			System.out.println("Error");
		}
	}
}
				
			
		
	


