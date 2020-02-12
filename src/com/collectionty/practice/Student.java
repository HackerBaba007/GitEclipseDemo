package com.collectionty.practice;

import java.util.Comparator;

public class Student {

	private int id;
	private String Name;
	private float percentage;
	
	public static Comparator sortById=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getId()-o2.getId();
		}
	}; 
	public static Comparator sortByName=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}; 
	public static Comparator sortByPercentage=new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return (int) (o1.getPercentage()-o2.getPercentage());
		}
	}; 
		
	public Student(int id, String name, float percentage) {
		
		this.id = id;
		Name = name;
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return Name;
	}
	
	public float getPercentage() {
		return percentage;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", percentage=" + percentage + "]";
	}
}
