package com.ynr.Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

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
	      Iterator<DeQueueDemo> itr=q.iterator();
	      int key=20;
	      while(itr.hasNext())
	      {
	    	  DeQueueDemo ele=itr.next();
	    	  if(ele.equals(itr))
	    	  {
	    		  System.out.println(ele);
	    		  break;
	    	  }
	    	  //System.out.println(itr.next());
	      }
	}
	
	      
	}


