package com.ynr.Methods;

public class Polygon {
      static void areaOfRectangle(int len,int wid) {
    	int res=len*wid;
    	System.out.println(res);
      }
      static void areaOfSquare(int side) {
    	  side=side*side;
    	  System.out.println(side);
      }
      static void areaOfCircle(double d) {
    	double res=3.14*(d*d);
    	System.out.println(res);
      }
      static void areaOfTriangle(int n1,int n2) {
    	  int res=(1/2)*(n1*n2);
    	  System.out.println(res);
      }
	
	
	
	public static void main(String[] args) {
		areaOfRectangle(10,4);
		areaOfSquare(5);
		areaOfCircle(10);
		areaOfTriangle(5,6);
	}

}
