package com.ynr.Basicpack1;


public class P4 {

	public static void main(String[] args) {
		double d=5.123;
		short s=(short)d;
		byte b=(byte)d;
		int n=(int)d;
        long l=(long)d;
        char c=(char)d;//type casting required
        float f=(float)d;
        System.out.println(b);
        System.out.println(s);
        System.out.println(n);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.println(d);
	 //byte to char & Short to char is not possible type casting required
     //While doing large datatype to small datatype type cast required explicitly   
	}

}
/* byte>short>int>long>float>double>char */