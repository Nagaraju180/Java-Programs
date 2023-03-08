package com.ynr.Methods;

public class Fibanocci {
	static int a=0,b=1,c;
	public static void main(String[] args)
	{
		int n=10;
		
      fibonacci(n);
	}
	
	static int fibonacci(int n) {
		if(n<=0) {
			return n;
		}else {
		   System.out.println(a);
		   c=a+b;
		   a=b;b=c;
		   fibonacci(n-1);   
		}
		return a;
			
	}

}
