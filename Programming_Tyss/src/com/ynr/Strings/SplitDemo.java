package com.ynr.Strings;

import java.util.Arrays;

public class SplitDemo {

	public static void main(String[] args) {
       String s="06-03-2023";
       
       String[] s1=s.split("-");
       
       System.out.println(Arrays.toString(s1));
       
       for(String res:s1) {
    	   System.out.println(res);
       }
       System.out.println("__________");
     
       String nm="Hello good mrng";
       String[] s2=nm.split(" ");
       System.out.println(Arrays.toString(s2));
       for(int i=0;i<s2.length;i++) {
    	   System.out.println(s2[i]);
       }
       
	}

}
