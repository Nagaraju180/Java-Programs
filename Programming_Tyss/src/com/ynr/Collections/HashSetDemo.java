package com.ynr.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
//product
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		System.out.println(hs);
		
		Iterator it=hs.iterator();
		
		int res=1;
		while(it.hasNext()) {
			 res *=(int)it.next();
					
		}
		System.out.println(res);
	}

}
