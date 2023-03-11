package com.ynr.Collections;

import java.util.ArrayDeque;

public class DeQueueDemo {

	public static void main(String[] args) {
		ArrayDeque q=new ArrayDeque();
	      
	      q.add(10);
	      q.add(20);
	      q.add(30);
	      q.add("raj");
	      q.add('y');
	      q.add(0.7);
	      q.add(10);
//	      q.add(null);
	      System.out.println(q);
	}

}
