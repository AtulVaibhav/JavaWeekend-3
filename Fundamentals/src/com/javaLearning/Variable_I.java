package com.javaLearning;

public class Variable_I {
    int data = 100;
	public static void main(String[] args) {
       // creating an object 
		//Classname objName = new ClassName();
		Variable_I obj = new Variable_I();
		System.out.println(obj.data);
		
		Variable_I obj2 = new Variable_I();
		
		System.out.println("Before updation-----");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		

		System.out.println("After updation-----");
		obj.data = 500;
		System.out.println(obj.data);
		System.out.println(obj2.data);
	}

}
