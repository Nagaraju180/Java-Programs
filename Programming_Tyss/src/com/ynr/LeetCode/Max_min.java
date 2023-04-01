package com.ynr.LeetCode;

import java.util.Arrays;
class pair  
{  
   long first, second;  
   public pair(long first, long second)  
   {  
       this.first = first;  
       this.second = second;  
   }  
} 

class Compute 
{
   static pair getMinMax(long a[], long n)  
   {
       Arrays.sort(a);
       long first=a[0];
       long second=a[a.length-1];
       pair p=new pair(first,second);
       return p;
   }
}
public class Max_min {

	public static void main(String[] args) {
       long n[]= {1,2,3,4,5,6};
       Compute c=new Compute();
       System.out.println(c.getMinMax(n,n.length-1));
	}

	

}
