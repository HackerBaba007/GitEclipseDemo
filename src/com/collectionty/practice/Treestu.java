package com.collectionty.practice;

import java.util.Scanner;
import java.util.TreeSet;

public class Treestu {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter desired details");
//		String input=s1.next();
		int input=s1.nextInt();
		
		switch(input) {
		
//		String id;
		case 1 : TreeSet ts=new TreeSet<Student>(Student.sortById);
		ts.add(new Student(8, "Gaurav", 70.3f));
		ts.add(new Student(5, "Liza", 69.3f));
		ts.add(new Student(3, "Monisha", 65.3f));
		ts.add(new Student(1, "Shubham", 63.3f));
		System.out.print(" "+ts);
		break;
		
//		String name;
		case 2 : TreeSet ts1=new TreeSet<Student>(Student.sortByName);
		ts1.add(new Student(8, "Gaurav", 70.3f));
		ts1.add(new Student(5, "Liza", 69.3f));
		ts1.add(new Student(3, "Monisha", 65.3f));
		ts1.add(new Student(1, "Shubham", 63.3f));
		System.out.print(" "+ts1);
		break;
		
//		String percentage;
		case 3 : TreeSet ts2=new TreeSet<Student>(Student.sortByPercentage);
		ts2.add(new Student(8, "Gaurav", 70.3f));
		ts2.add(new Student(5, "Liza", 69.3f));
		ts2.add(new Student(3, "Monisha", 65.3f));
		ts2.add(new Student(1, "Shubham", 63.3f));
		System.out.print(" "+ts2);
		break;
		}
	}
}
