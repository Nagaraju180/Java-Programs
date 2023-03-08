package com.ynr.Strings;

import java.util.Scanner;

public class Count_Char {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String:");
      String s=sc.next();
      
      char[] ch=s.toCharArray();
      int count=0;
      for(int i=0;i<s.length();i++) {
    	  if((ch[i]>='a' && ch[i]<='z') || ch[i]>='A' && ch[i]<='Z') {
			count++;
    	  }
      }
      System.out.println(count);
	}

}
