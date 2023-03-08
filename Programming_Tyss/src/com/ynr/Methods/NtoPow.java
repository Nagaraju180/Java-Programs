package com.ynr.Methods;

public class NtoPow {
	public static void main(String[] args) {
       
       System.out.println(ntoPow(5,2));
	}

       static int ntoPow(int base,int pow) {
         if(pow<=0) return 1;
         else {
        	 return (base*ntoPow(base,pow-1));
        	 
         }
         
	}

}
