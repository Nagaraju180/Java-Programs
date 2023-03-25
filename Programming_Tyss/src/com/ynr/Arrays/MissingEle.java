package com.ynr.Arrays;

public class MissingEle {

	public static void main(String[] args) {
      int[] a= {2,3,4,5,6};
      int i=0;
      int k=a[0]-1;
      
      while(i!=a.length) {
    	  if(k==a[i]) {
    		  i++;
    		  k++;
    	  }else {
    		  System.out.println(k);
    		  break;
    	  }
      }
	}

}
