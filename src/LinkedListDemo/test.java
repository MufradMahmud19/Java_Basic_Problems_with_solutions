package LinkedListDemo;

import java.util.LinkedList;

public class test{
	public static void main(String[] args) {
		LinkedList<Student> StudentList = new LinkedList<Student>();
		
		Student s1= new Student(123, "Mufrad", "Eleven");
		Student s2= new Student(124, "Monkey", "Eleven");
		Student s3= new Student(125, "Arafat", "Eleven");
		
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		
		for(Student s: StudentList) {
			System.out.println("Name: "+s.Name+"    "+"ID: "+s.ID+"    "+"Class: "+s.CN);
		}
	}
}
