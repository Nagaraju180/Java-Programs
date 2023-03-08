package com.ynr.Assingments;

public class BinarySearch {

	public static void main(String[] args) {
      int [] a= {10,20,30,40,50,60};
      int low=0;
      int high=a.length-1;
      int target=40;
      
      boolean flag=false;
      while(low<=high) {
    	  int mid=(low+high)/2;
    	  
    	  if(a[mid]==target) {
    		  flag=true;
    		  break;
    	  }
    	  else if(target>a[mid]) {
    		  low=mid+1;
    	  }
    	  else if(target<a[mid]) {
    		  high=mid-1;
    	  }
      }
      if(flag==true)
    	  System.out.println(target+" Found:)");
      else
    	  System.out.println(target+" Not Found!!");
	}

}
