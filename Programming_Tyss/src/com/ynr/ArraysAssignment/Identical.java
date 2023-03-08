package com.ynr.ArraysAssignment;

public class Identical {
   public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		if(a1.length==a2.length)
		{
			boolean flag=true;
			for (int i = 0; i < a1.length; i++) 
			{
				if(a1[i]==a2[i])
				{
					
				}
				else
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
				System.out.println("Identicle");
			else
				System.out.println("Not Identicle");
		}else
		{
			System.out.println("Not Identicle ");
		}
	}
}
