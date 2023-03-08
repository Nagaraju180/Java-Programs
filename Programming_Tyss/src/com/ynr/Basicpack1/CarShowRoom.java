package com.ynr.Basicpack1;

import java.util.Scanner;

public class CarShowRoom {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter ur intrested car model:");
      String carName=sc.nextLine();
      
      switch(carName) {
      case "swift": System.out.println("Swift details");
      break;
      case "kia": System.out.println("kia details");
      break;
      case "benz": System.out.println("benz details");
      break;
      case "audi": System.out.println("audi details");
      break;
      default: System.out.println("Enter valid car model Name!!");
      }
	}

}
