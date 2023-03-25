package com.ynr.NumPrgms;

public class BuzzNum {

	public static void main(String[] args) {
      int num=2457;
      int last=num%10;
      if(last==7||last%7==0)
    	  System.out.println("Buzz Number");
      else
    	  System.out.println("Not a Buzz Num");
	}

}
