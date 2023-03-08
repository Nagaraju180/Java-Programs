package com.ynr.Arrays;

import java.util.Arrays;

public class Inserting_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] n= {2,3,5,3,4};
      int[] n1=new int[n.length+1];
      int ind=3;
      int j=0;
      int num=15;
      for(int i=0;i<=n.length-1;i++)
      {	
    	if(ind==i)
    	{
    	  n1[j]=num;
    		j++;
    		
    	}
    	  n1[j]=n[i];
    	  j++;
      }
      for(int i=0;i<=n1.length-1;i++)
      {	
    	  System.out.println(n1[i]);
      }
      System.out.println(Arrays.toString(n1));
      }
      
  
}
