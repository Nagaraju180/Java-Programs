	package com.ynr.NumPrgms;

public class Duck_Number {

	public static void main(String[] args) {
      int num=000001000;
      int temp=num;
      boolean flag=false;
      while(num>9) {
    	  num=num/10;
      }
      if(num==0) {
    	  System.out.println("Not Duck number");
    	  return;
      }
      else {
    	  while(temp>9) {
    		  int rem=temp%10;
    		  
    		  if(rem==0) {
    			  flag=true;
    			  break;
    		  }
    		  temp/=10;
    	  }
      }
      if(flag==true) {
    	  System.out.println("Duck");
      }
      else {
    	  System.out.println("Not duck");
      }
	}

}
