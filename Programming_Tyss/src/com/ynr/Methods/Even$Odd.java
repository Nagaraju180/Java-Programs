package com.ynr.Methods;

public class Even$Odd {

	public static void main(String[] args) {
      int n=20;
      evenOdd(n);
	}

	   static int evenOdd(int n) {
		  if(n<=1) {
			  return n;
		  }else {
			  if(n%2==0) System.out.println("Even="+n);
			  else if(n%2!=0) System.out.println("Odd="+n);
			  evenOdd(n-1);
			  return n;
		  }
		
	  }

}
