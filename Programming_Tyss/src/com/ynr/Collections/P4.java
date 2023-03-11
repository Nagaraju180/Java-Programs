package com.ynr.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class P4 {

	public static void main(String[] args) { 
    		
        LinkedHashSet lh=new LinkedHashSet();
        
          lh.add(22);
          lh.add("raju");
          lh.add(34);
          lh.add("hemanth");
          lh.add(24);
          lh.add("praveen");
          lh.add(25);
          lh.add("purush");
          
         Iterator it=lh.iterator();
         
         while(it.hasNext()) {
        	 int age=(int)it.next();
        	 String nm=(String)it.next();
        	if( age%2==0) {
        			System.out.println(nm+" "+age);
        	}
         }
	}
}
