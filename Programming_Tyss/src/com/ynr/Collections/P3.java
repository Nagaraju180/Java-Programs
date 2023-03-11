package com.ynr.Collections;

import java.util.ArrayList;

public class P3 {

	public static void main(String[] args) {
		 ArrayList al=new ArrayList();
	      
	      al.add("Raju");
	      al.add("purush");
	      al.add("praveen");
	      al.add("hemanth");
	      al.add("hari");
	      
	      System.out.println(al);
	      System.out.println("--------------------");
//4	      
	      ArrayList al2=new ArrayList();
	      al2.add(al);
	      System.out.println(al2);
	     
	}

}
