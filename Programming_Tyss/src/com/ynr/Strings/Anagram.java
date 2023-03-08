package com.ynr.Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
      String s1="anagram";
      String s2="asdf";
      System.out.println(isAnagram(s1,s2));
	}
	static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean flag=false;
		
		for(int i=0;i<c1.length;i++) {
		 	if(c1[i]==c2[i]) {
		 	  return flag=true;
		 	}else {
		 		flag=false;
		 	}
		}
		return flag;
	}

}
