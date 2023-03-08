package com.ynr.Methods;

public class P4 {

	public static void main(String[] args) {
	System.out.println(areaOfCircle());
	System.out.println(circumferenceOfCircle());
	System.out.println(greatestNum());
	averageMarks();
	percentage();
	}
	static double areaOfCircle() {
    	double res=3.14*(5*2);
    	return res;
	}
	
	static double circumferenceOfCircle() {
		int r=2;
		double cir=2*3.14*r;
		
		return cir;
	}
	
	static String greatestNum() {
		int a=30;
		int b=14;
		int c=20;
		
		String res=a>b && a>c?"a is greater":b>c?"b>c":"c is greater";
		return res;
	}
	static void averageMarks() {
		int avg=(65+78+44+89+55)/5;
		
		int per=(331*100)/500;
		System.out.println("Average marks="+avg);
		System.out.println("percentage="+per);
	
	}
	
	static void percentage() {
		double per=77;
		if(per>90) System.out.println("A grade");
		else if(per>80 && per<=90) System.out.println("B grade");
		else if(per>=60 && per<=80) System.out.println("C grade");
		else if(per<60) System.out.println("D grade");
	}

}
