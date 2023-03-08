package com.ynr.Basicpack1;

import java.util.Scanner;

public class P12 {
  //check whether character is vowel or consonant or number
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a charecter:");
	      String s=scn.next();
	      char c=s.charAt(0);
	      
	      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	    	  System.out.println("vowel letter");
	      }
	      else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='O'){
	    	  System.out.println("vowel letter");
	      }

	      else if(c>='0' && c<='9') {
	    	  System.out.println("it is a num");
	      }
	      else {
	    	  System.out.println("it ia consonant");
	      }
	    	  
	      
	      
	}

}
