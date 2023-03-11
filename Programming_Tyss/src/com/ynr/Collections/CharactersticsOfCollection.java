package com.ynr.Collections;

import java.util.ArrayList;

public class CharactersticsOfCollection {

	public static void main(String[] args) {
      ArrayList al=new ArrayList();
      
      al.add(10);
      al.add(20);
      al.add(30);
      al.add("raj");
      al.add('y');
      al.add(0.7);
      al.add(10);
      al.add(null);
      al.add(null);
      System.out.println(al);
      System.out.println("__________");
      
      al.remove(1);//index
      al.remove("raj");//object
      System.out.println(al);
      System.out.println("__________");
      
      ArrayList al2=new ArrayList();
      al2.add(50);
      al2.add("nag");
      System.out.println(al2);
      System.out.println("__________");
      
      al.addAll(al2);
      System.out.println(al);
      System.out.println("__________");
      
      al.removeAll(al2);
      System.out.println(al);
      System.out.println("__________");
      
      System.out.println(al.retainAll(al2));
	}

}
