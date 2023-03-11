package com.ynr.Collections;

import java.util.LinkedList;

public class P2 {

	public static void main(String[] args) {
     LinkedList ll=new LinkedList();
     
     ll.add("Billa");
     ll.add("Mirchi");
     ll.add("Bahubali");
     ll.add("Salaar");
     ll.add("Project K");
     
     LinkedList ll2=new LinkedList();
     
     ll2.add(ll);
     System.out.println(ll2);
	}

}
