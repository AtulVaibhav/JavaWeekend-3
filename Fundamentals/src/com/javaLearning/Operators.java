package com.javaLearning;

public class Operators {
  public static void arithmeticOperator(){
	  int a = 10;
	  int b=5;
	  System.out.println(a+b);
	  System.out.println(a-b);
	  System.out.println(a*b);
	  System.out.println(a/b);
	  System.out.println(a%b);
	  
  }
  
  public static void unaryOperator(){
	  int a = 10;
	  int b = a++;
	  System.out.println(a+" "+b);
	  
	  int c = 11;
	  int d = ++c;
	  System.out.println(c+" "+d);
	  
	  System.out.println(-a);
  }
  public static void relationalOperator(){
	  int a = 10;
	  int b = 20;
	  System.out.println(a>b);
	  System.out.println(a<b);
	  System.out.println(a>=b);
	  System.out.println(a<=b);
	  System.out.println(a==b);
	  System.out.println(a!=b);
  }
  
  public static void logicalOperator(){
	  int x =13;
	  int y = 15;
	  
	  System.out.println((x==y)&&(x!=y));
	  System.out.println((x==y)||(x!=y));
	  System.out.println(!((x==y)||(x!=y)));
  }
  
	public static void main(String[] args) {
		arithmeticOperator();
		unaryOperator();

	}

}
