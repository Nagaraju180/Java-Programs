package com.ynr.Strings;

public class Vowels_Con_spl_Count {

	public static void main(String[] args) {
       String s="software-developer";
       char[] a=s.toCharArray();
       int vow=0;
       int con=0;
       int spl=0;
       
       for(int i=0;i<a.length;i++) {
    	   if(a[i]>='a' && a[i]<='z') {
    		   if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
    			   vow++;
    		   }else {
    			   con++; 
    		   }
    	   }else if(a[i]!=' '){
    		   spl++;
    	   }
       }
       System.out.println("Vowels="+vow+" Con="+con+" splChar="+spl);
	}

}
