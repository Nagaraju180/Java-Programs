package com.ynr.Strings;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two Strings");
      
      String s1=sc.next();
      String s2=sc.next();
      
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));
      System.out.println(s1.compareTo(s2));
      System.out.println(s1.equalsIgnoreCase(s2));
	}

}
