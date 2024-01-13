package com.javaLearning;

public class TypeCasting_I {
   public void widening(){
	   int a = 200;
	   long b = a;
	   System.out.println(b);
	   
	   char ch = 'A';
	   int value = ch;
	   System.out.println(value);
   }
   
   public void narrowing(){
	    long b = 100;
	    int c = (int)b;
	    System.out.println(c);
	    
	    short x = 296;
	    byte y =(byte)x;
	    System.out.println(y);
   }
	public static void main(String[] args) {
	  TypeCasting_I obj = new TypeCasting_I();
	  obj.widening();
	  obj.narrowing();
     System.out.println(Short.MIN_VALUE+" "+Short.MAX_VALUE);
	 System.out.println(Short.SIZE);
	}

}
