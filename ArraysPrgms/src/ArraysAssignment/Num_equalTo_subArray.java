package ArraysAssignment;

import java.util.Arrays;

public class Num_equalTo_subArray {
	
	public static int[] resub(int a[],int k)
	{
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=a[i];
		   for(int j=i+1;j<=a.length;j++)
		   {
			   if(sum==k)
			   {
				   return new int[] {i,j-1};
				   
				   
			   }
			   if(sum>k)
			   {
				  break;
			   }
			   if(j<a.length)
			   {
				   sum=sum+a[j];
				
			   }
		   }
		}
		return new int[] {-1};
		
	}

	public static void main(String[] args) {
		int []a= {2,4,3,5,3,2};
		int key=10;
		System.out.println(Arrays.toString(resub(a, key)));	
	}

}