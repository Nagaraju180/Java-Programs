package com.ynr.Basicpack1;

import java.util.Scanner;

public class Shoping {
  //1 Switch
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Shirt size:");
       int size=sc.nextInt();
       
       switch(size) {
       case 28: System.out.println("Go to small size section");
       break;
       case 30: System.out.println("30 size Avilable shirts displayed");
       break;
       case 32: System.out.println("32 size Avilable shirts displayed");
       default:System.out.println("Enter valid shirt size");
       }
    	   
       
	}

}

