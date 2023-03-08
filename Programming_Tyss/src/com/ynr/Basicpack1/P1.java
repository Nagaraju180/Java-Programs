package com.ynr.Basicpack1;

public class P1 {

	public static void main(String[] args) {
		//Widening
       byte b=10;
       short s=b;
       System.out.println(b);
       int i=5;
       long l=i;
       System.out.println(i);
       float fl=3.4f;
       double d=fl;
       System.out.println(d);
       //Narrowing
       char c=(char)i;
       System.out.println(c);
       byte bt=(byte)s;
       System.out.println(bt);
       Short sh=(short)i;
       System.out.println(sh);
       int in=(int)l;
       System.out.println(in);
	}

}
