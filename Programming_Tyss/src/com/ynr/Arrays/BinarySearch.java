package com.ynr.Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a key");
		int key=sc.nextInt();
		
       int[]a= {10,20,30,40,50,60};
       int low=0;
       int high=a.length-1;
       int mid=0;
       boolean flag=false;
       while(low<=high) {
    	   mid=(low+high)/2;
    	   if(key==a[mid]) {
    		   flag=true;
//    		   System.out.println("Found in index="+mid);
    		   break;
    	   }
    	   else if(key>a[mid]) {
    		   low=mid+1;
    		//   high=high;
    	   }
    	   else if(key<a[mid]){
    		   high=mid-1;
    		//   low=low;
    	   }
       }
      if(flag==true) System.out.println("Element is found in index="+mid);
      else System.out.println("Element not found!!");
       
	}

}
