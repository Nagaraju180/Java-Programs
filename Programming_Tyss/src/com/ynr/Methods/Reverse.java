 package com.ynr.Methods;

public class Reverse {
  static   long rev=0;
  static   long rem;
	public static void main(String[] args) {
       long n=12345;
       System.out.println(reverse(n));
	}

	   public static long reverse(long n) {
         if(n<=0) {return n;}
         else {
        	 rem=n%10;
        	 rev=(rev*10)+rem;
        	 n/=10;
        	 reverse(n);
        	 return rev;
         }
	}

}
