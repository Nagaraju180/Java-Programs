package com.ynr.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
	int id;
	String name;
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
     ArrayList al=new ArrayList();
       al.add(new Student(1013,"raju"));
       al.add(new Student(101,"raju"));
       al.add(new Student(107,"raju"));
       Collections.sort(al);
       System.out.println(al);
	}

	@Override
	public String toString() {
		return "Student [name=" + name +" id="+id+"]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.id>o.id) {
			return +1;
		}
		else if(this.id<o.id){
			return -1;
		}
		return 0;
	}
}	

