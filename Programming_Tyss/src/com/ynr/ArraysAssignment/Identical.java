package com.ynr.ArraysAssignment;

public class Identical {
   public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		boolean flag=true;
		if(a1.length!=a2.length)
		{
			System.out.println("Not Identical");
		}
		else
		{
			for (int i = 0; i < a1.length; i++) 
			{
				if(a1[i]!=a2[i])
				{
					flag=false;
					break;
				}
				
			}
			
			if(flag==false)
				System.out.println("Not Identical");
			else
				System.out.println("Identicle");
		}
	}
}
