package com.ynr.Strings;

import java.util.Scanner;

public class All_Basics {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String");
       String s=sc.nextLine();
//       String s1=sc.next();
       
//1       System.out.println(s.charAt(3));
       
//2       System.out.println(s.charAt(0)+","+s.charAt(s.length()-1));
       
       
//3      for(int i=0;i<s.length();i++) {
//         if(s.charAt(i)=='a') {
//    	   System.out.println(i);  //printing index of 'a' in given string
//         }
//       }
       
//8       System.out.println(s.length());
       
//9       System.out.println(s.length()+s1.length());
       
       
//10         for(int i=0;i<s.length()-1;i++) {
//        	    System.out.println(s);
//           }
       
       
//4      System.out.println(s.equals(s1));
       
       
  //printing characters  from a string which is presenting in the even index
//       char[] ch=s.toCharArray();
//      for(int i=0;i<s.length();i++) {
//    	  if(i%2==0) {
//    		  System.out.print(ch[i]+",");
//    	  }
//      }
//       
       
 //counting the spaces in string
//       char[]ch=s.toCharArray();
//       int count=0;
//       for(int i=0;i<s.length();i++) {
//    	   if(ch[i]==' ') {
//    		   count++;
//    	   }
//       }
//       System.out.println(count);
       
       
       
//counting  the uppercase characters   
//       char[]ch=s.toCharArray();
//       int count=0;
//       for(int i=0;i<s.length();i++) {
//    	   if(ch[i]>='A'&& ch[i]=<'Z') {
//    		   count++;
//    	   }
//       }
//       System.out.println(count);
       
       
// counting lowercase and special characters in a string
//       int count1=0;
//       int count2=0;
//       
//       for(int i=0;i<s.length();i++) {
//    	   if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
//    		   count1++;
//    	   }else if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
//    		   
//    	   }
//    	   else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
//    		   
//    	   }
//    	   else {
//    		   count2++;
//    	   }
//       }
//       System.out.println(count1+" "+count2);
       
       
	}

}
