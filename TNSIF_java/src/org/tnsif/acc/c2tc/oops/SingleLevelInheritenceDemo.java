package org.tnsif.acc.c2tc.oops;

class Course{
	String courseName="Java";
	
	void showCourse() //instance variable"declared inside class"
	{
		System.out.println("Course : "+ courseName);
		
	}
}

class Student extends Course
{
	String name ="Ram";
	
	void showStudent() {
		System.out.println("Student : "+name);
	}
}

public class SingleLevelInheritenceDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.showCourse();
		student.showStudent();
	}

}
