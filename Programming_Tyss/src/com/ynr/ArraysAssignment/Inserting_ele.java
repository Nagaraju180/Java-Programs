package com.ynr.ArraysAssignment;

public class Inserting_ele {

	public static void main(String[] args) {
		int[] a= {2,3,5,3,4};
	      int[] a1=new int[a.length+1];
	      int ind=3;
	      int num=15;
	      int j=0;
	      
	      for(int i=0;i<a.length;i++) {	
	    	if(ind==i) {
	    	  a1[j]=num;
	    		j++;
	    		
	    	}
	    	  a1[j]=a[i];
	    	  j++;
	      }
	      for(int i=0;i<a1.length;i++) {
	    	  System.out.println(a1[i]);
	      }	      
	}

}
