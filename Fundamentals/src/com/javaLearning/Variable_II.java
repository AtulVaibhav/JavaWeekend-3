package com.javaLearning;

public class Variable_II {
    static int data = 200;
	public static void main(String[] args) {
		System.out.println(Variable_II.data);
		
		Variable_II obj = new Variable_II();
		System.out.println(obj.data);
		
		Variable_II obj2 = new Variable_II();
		
		System.out.println("----Before updation--");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		System.out.println("----After updation---");
		obj.data = 500;
		System.out.println(obj.data);
		System.out.println(obj2.data);
	}

}
