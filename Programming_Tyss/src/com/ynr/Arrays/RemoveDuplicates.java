package com.ynr.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		      int [] a = {1,1,1,2,2,3};
		      int count=0;
		      for(int i=0;i<a.length;i++) {
		    	  
		    	  for(int j=i+1;j<a.length;j++)
		    	  {
		    		  if(a[i]==a[j] && a[j]!=-1)
		    		  {
		    			  a[j]=-1;
		    			  count++;
		    		  }
		    	}
		      }
//		      System.out.println(count);
		      int [] b = new int[a.length];
		      int temp=0;
		      for(int i=0;i<a.length;i++)
		      {
		    	  if(a[i]!=-1)
		    	  {
		    		 b[temp++]=a[i]; 
		    	  }else {
		    	  }
		      }
		      
		      for(int n : b)
		      {
		    	  if(n!=0) {
		    	  System.out.print(n+" ");
		    	  }else {
		    		  System.out.print("-"+" ");
		    	  }
		      }

	}

}
