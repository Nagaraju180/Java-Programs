package com.ynr.Strings;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String:");
       String s=sc.next(); 
    //1.  System.out.println(s.substring(s.length()-4)); //last 4 data
       
    //2.  System.out.println(s.substring(0,4).concat("******"));//1234******
        
    //3    System.out.print(s.charAt(0)+" "+s.charAt(s.length()-1)); //1st and Last
       
//  4    String s1="";
//      s1=s.toUpperCase();
//      String temp="";
//      char[]ch=s.toCharArray();
//       for(int i=0;i<s.length();i++) {
//    	   if(i%2!=0 && s1.charAt(i)!=' ') {
//    		   temp+=(char)(s1.charAt(i)+32);
//    	   }else {
//    		   temp+=s1.charAt(i);
//    	   }
//       }
//       System.out.println(temp);
       
//       int countvo=0;
//       int countco=0;
//       for(int i=0;i<s.length();i++) {
//    	   char c=s.charAt(i);
//    	   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//    		   countvo++;
//    	   }else {
//    		  countco++; 
//    	   }
//       }
//       System.out.println("Vowels="+countvo);
//       System.out.println("Consonents="+countco);
//    		  
//    		String s1="";  
//    	for(int i=0;i<s.length();i++) {
//    		if(i<s.length()-4) {
//    		s1=	s.toUpperCase();
//    		}else {
//    			s1=s.toLowerCase();
//    		}
//       }
//    	System.out.println(s1);
//    	
//    	
//    	System.out.println(s.toUpperCase().substring(0,4));
       
       String s2="";
       
       for(int i=0;i<s2.length();i++) {
    	   s2+=(char)s.charAt(i)+32;
       }
       System.out.println(s2);
	
	}

}
