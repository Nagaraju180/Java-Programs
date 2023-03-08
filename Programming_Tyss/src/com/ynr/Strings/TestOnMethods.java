package com.ynr.Strings;

import java.util.Scanner;

public class TestOnMethods {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a name to convert Uppercase");
      String nm1=sc.next();
      System.out.println(nm1.toUpperCase());
      System.out.println("_______________");
      
      System.out.println("Enter a name to convert Lowercase");
      String nm2=sc.next();
      System.out.println(nm2.toLowerCase());
      System.out.println("_______________");
      
      String s1="Java Program";
      System.out.println(s1.charAt(5));
      System.out.println(s1.length());
      System.out.println("_______________");
      
      String s2="Test Yantra";
      System.out.println(s2.substring(0, s2.length()));
      System.out.println("_______________");
      
      System.out.println(s1.compareTo(s2));
      System.out.println("_______________");
      
      String s3="Raju";
      String s4="raju";
      System.out.println(s3.equalsIgnoreCase(s4));
      String s5="Naga";
      String s6="Raju";
      System.out.println(s5.concat(s6));
      System.out.println(s5.equals(s6));
      System.out.println("_____________________");
      
      String s7="Bangalore";
      System.out.println(s7.contains("gal"));
      System.out.println(s7.endsWith("ore"));
      System.out.println("__________________________________");
      String s8="Harison";
      System.out.println(s8.isEmpty());
      System.out.println(s8.indexOf('r'));
      System.out.println("__________________________________");
      
      String s9=" java ";
      System.out.println(s9.trim());  //it removes unwanted spaces
      
      
	}

}
