package com.ynr.LeetCode;

public class IndexOf1stOccurString {

	public static void main(String[] args) {
       String s1="sadbutsad";
       String s2="sad";
	}
       
       static int  str(String haystack, String needle) {
    	   int n = needle.length();
    	    if (n == 0) {
    	        return 0;
    	    }
    	    int m = haystack.length();
    	    if (m < n) {
    	        return -1;
    	    }
    	    for (int i = 0; i <= m - n; i++) {
    	        if (haystack.substring(i, i + n).equals(needle)) {
    	            return i;
    	        }
    	    }
    	    return -1;
       }

}
