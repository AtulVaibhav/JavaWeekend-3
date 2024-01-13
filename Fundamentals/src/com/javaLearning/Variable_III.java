package com.javaLearning;

public class Variable_III {
   
	public void doSomething(){
		int data = 300;
		System.out.println(data);
	}
	
	public int m1(){
		int data2 = 500;
		return data2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Variable_III obj = new Variable_III();
       obj.doSomething();
       int result = obj.m1();
       System.out.println(result);
	}

}
