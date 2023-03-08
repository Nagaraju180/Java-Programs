package com.ynr.Strings;

public class StringClass_Methods {

	public static void main(String[] args) {
      String s="Software developer";
      System.out.println(s.length());
      System.out.println(s.toUpperCase());
      System.out.println(s.toLowerCase());
      System.out.println(s.startsWith("soft"));
      System.out.println(s.endsWith("Per"));
      System.out.println(s.contains("dev"));
      System.out.println(s.concat(" in TestYantra."));
      System.out.println(s.charAt(2));
      System.out.println(s.indexOf('s'));
      System.out.println(s.indexOf('e'));
      System.out.println("---------------------------");
      String s1="java";
      String s2="java";
      String s3="Java";
      System.out.println(s1.equals(s2));
      System.out.println(s2.equals(s3));
      System.out.println(s2.equalsIgnoreCase(s3));
      String nm="hello java";
      System.out.println(nm.substring(3));
      System.out.println(nm.substring(6));
      
      
	}

}
