package com.javaLearning;

class Student{
	int id = 101;
	String name = "Aryan";
	
	public Student(){
		
	}
	public Student(int d,String n){
		id=d;
		name = n;
	}
	public void showData(){
		System.out.println("Id :"+this.id+" Name :"+this.name);
	}
}
public class Constructor_II {

	public static void main(String[] args) {
		Student s1 = new Student(101,"Aryan");
		s1.showData();
		Student s2=  new Student(102,"Harsh");
		s2.showData();

	}

}
