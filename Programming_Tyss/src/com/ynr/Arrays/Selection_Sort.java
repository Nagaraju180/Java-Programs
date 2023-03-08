package com.ynr.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
         int[]a= {7,4,1,3,2,5};
         for(int i=0;i<a.length-1;i++) {
        	 int in=i;
        	 for(int j=i+1;j<a.length;j++) {
        		 if(a[j]<a[in]) {//finding min value
        			 in=j;
        		 }
        	 }
        		 if(i!=in) {
        			 int temp=a[in];
        			 a[in]=a[i];
        			 a[i]=temp;
        		 }
        	 }
         for(int n:a) System.out.println(n);
	}
}
