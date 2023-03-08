package com.ynr.Arrays;

public class Compare_2dMatrix_same$not {

	public static void main(String[] args) {
		 int[][] a1={{10,18},
   		             {30,40}};
     
         int[][] a2={{10,20,},
   		             {30,40,}};
   		             
         boolean flag=true;
         for(int i=0;i<a1.length;i++) {
        	 for(int j=0;j<a2[i].length;j++) {
        		 if(a1[i][j]!=a2[i][j]) {
                   flag=false;
                   break;
        		 }else {
        			 flag=true;
        		 }
        	 }
         }
         if(flag==true) 
        	 System.out.println("same");
         else
        	 System.out.println("Not same");
	}

}
