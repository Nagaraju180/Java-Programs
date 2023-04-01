package ArraysAssignment;

import java.util.Arrays;

public class BinarySearch_recur {

	 static int binary(int a[],int low,int high,int key)
	 { 
		 while(low<high)
		 {
			 int mid=(low+high)/2;
			 if(key==a[mid])
			 {
				return mid;
			 }
			 else if(key<a[mid])
			 {
				return binary( a, low, mid-1, key); 
			 }
			 else if(key>a[mid])
			 {
				 return binary( a, mid+1, high, key);			 
			 }		 
		 }
		 return 0;
		 
	 }
	public static void main(String[] args) {
       int a[]= {34,56,23,45,70};
       Arrays.sort(a);
       System.out.println(Arrays.toString(a));
       int key=56;
       int ind=binary(a,0,a.length-1,key);
       if(ind==0) {
    	   System.out.println("Not found");
       }else {
    	   System.out.println("Key found in Index="+ind);   
       }
	}

}