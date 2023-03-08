package com.ynr.Basicpack1;

import java.util.Scanner;
//4
public class MiniCalculator {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num1=sc.nextInt();
    System.out.println("Enter a number");
    int num2=sc.nextInt();
    System.out.println("Enter an Operator");
    char op=sc.next().charAt(0);
    
    switch(op) {
    case '+':System.out.println(num1+"+"+num2+"="+num1+num2);
    break;
    case '-':System.out.println(num1+"-"+num2+"="+(num1-num2));
    break;
    case '*':System.out.println(num1+"*"+num2+"="+num1*num2);
    break;
    case '/':System.out.println(num1+"/"+num2+"="+num1/num2);
    break;
    case '%':System.out.println(num1+"%"+num2+"="+num1%num2);
    break;
    default: System.out.println("Enter valid data!!");
    }
	}

}
