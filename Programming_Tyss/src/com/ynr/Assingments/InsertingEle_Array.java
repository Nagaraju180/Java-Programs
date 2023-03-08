package com.ynr.Assingments;

public class InsertingEle_Array {

	public static void main(String[] args) {
     int[] a= {1,2,3,4,5};
     int[] a1=new int[a.length+1];
     int ind=2;
     int num=50;
     int j=0;
     for(int i=0;i<a.length;i++) {
    	 if(ind==i) {
    		 a1[j]=num;
    		 j++;
    	 }
    	 a1[j]=a[i];
    	 j++;	 
     }
     for(int k=0;k<a1.length;k++) {
    	 System.out.println(a1[k]);
     }
	}

}
