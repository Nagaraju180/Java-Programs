package com.ynr.Methods;

public class MergArray_zigzag {

	public static void main(String[] args) {
      int[] a= {1,2,3,4,5,11,12,7,8,9};
      int[] b= {6,7,8,9,10};
      
      int[] c=new int[a.length+b.length];
      int j=0,k=0;
      
      for(int i=0;i<c.length;) {
    	  if(j<a.length) {
    	    c[i]=a[j];
    	    i++;j++;
    	  }
    	  if(k<b.length) {
    	    c[i]=b[k];
    	    i++;k++;
    	  }
      }
      
      for(int n:c) {
    	  System.out.println(n);
      }
	}

}
