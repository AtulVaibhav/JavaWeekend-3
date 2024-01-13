package com.javaLearning;

public class Method_II {
    int data = 100;
    static int data2 = 200;
    
    public void nonStaticFn(){
    	System.out.println(data);
    	System.out.println(data2);
    }
    
    public static void staticFn(){
    	Method_II obj = new Method_II();
    	System.out.println(obj.data);
    	System.out.println(data2);
    }
	public static void main(String[] args) {
		

	}

}
