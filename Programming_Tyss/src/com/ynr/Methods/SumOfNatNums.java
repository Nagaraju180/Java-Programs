package com.ynr.Methods;

public class SumOfNatNums {

	public static void main(String[] args) {
        int num=10;
        System.out.println(sum(num));
	}

	private static int sum(int num) {
       if(num<=1) return num;
       else return (num+sum(num-1));
	}

}
