package com.ynr.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student1  {
	int id;
	String name;
	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Student1(105,"raju"));
		al.add(new Student1(101,"hari"));
		al.add(new Student1(103,"hem"));
		al.add(new Student1(102,"triv"));
		
		Collections.sort(al,new Comparator1());

		for(Object o:al) 
			System.out.println(o);
		
	}

	@Override
	public String toString() {
		return "id="+id+" name="+name;
	}
	
}
class Comparator1 implements Comparator<Student1>{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.id-o2.id;
	}

}
