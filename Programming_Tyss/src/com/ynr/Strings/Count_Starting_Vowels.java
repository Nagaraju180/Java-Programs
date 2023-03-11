package com.ynr.Strings;

import java.util.Scanner;

public class Count_Starting_Vowels {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a String:");
	      String s=sc.nextLine();
	      
	    //  char[] ch=s.toCharArray();
	       
	      String[] s1=s.split(" ");
	      int count=0;
	      
	    	  for(int j=0;j<s1.length;j++) {
	    		   char[] ch=s1[j].toCharArray();
	    		  if(ch[0]=='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u') {
	    			  count++;
	    		  }  
	    	  }
	      
	      System.out.println(count);
	}
}
