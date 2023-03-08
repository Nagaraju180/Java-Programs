package com.ynr.ArraysAssignment;

import java.util.Arrays;

public class Removing_ele {

		public static void main(String[] args) {
			int a[]= {1,2,3,44,5,55};
			int b[]= new int[a.length-1];
			int num=44;
			int ind=0;
			
			for (int i = 0; i <a.length; i++) 
			{
				if(a[i]==num)
				{
				}
				else
				b[ind++]=a[i];		
			}
			System.out.println(Arrays.toString(b));
	}

}
