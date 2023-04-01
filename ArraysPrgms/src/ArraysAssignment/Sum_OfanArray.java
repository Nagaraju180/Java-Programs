package ArraysAssignment;

import java.util.Scanner;

public class Sum_OfanArray {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the array size");
     int n=sc.nextInt();
     
     int[] a=new int[n];
     
     System.out.println("enter the values");
     for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
     }
     
     int sum=0;
     for(int i=0;i<a.length;i++) {
    	 sum=sum+a[i];
     }
     System.out.println(sum);
    		 
		
		
		
	}

}