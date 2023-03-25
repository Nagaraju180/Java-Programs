package com.ynr.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingDupl_word {

//	public static void main(String[] args) {
//		String []s= {"hello","jai","hello","jai","raju","hello","praveen"};
//	      for(int i=0;i<s.length;i++) {
//	    	  int count=0;
//	    	  for(int j=0;j<s.length;j++) {
//	    		  if(s[i]==s[j]) {
//	    			  count++;
//	    		  }
//	    	  }
//	    	  if(count==1) {
//	    		  System.out.println(s[i]);
//	    	  }
//	      }
//	}
	
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter the number of elements u want");
//		int n = sc.nextInt();
//		int [] a = new int [n];
//		System.out.println("Enter your elements");
//		for (int i = 0; i < a.length; i++) 
//		{
//			a[i] = sc.nextInt();
//		}
//		Arrays.sort(a);
//	}
	
	public static void main(String[] args) 
	{
		int [] a = {1,2};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) 
		{
			if(a.length != 1)
			{
				if(i != a.length - 1)
				{
					int n = a[i];
					if(a[i+1] == n+1);
					else
					{
						System.out.println(n+1+" is missing");
					}
				}
			}
			else
			{

					System.out.println(a[i]+1+" is missing");
			}
		}
	}
	

}
