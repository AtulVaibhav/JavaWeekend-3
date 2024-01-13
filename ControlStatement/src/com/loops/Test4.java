package com.loops;

import java.util.Scanner;

public class Test4 {
    public static void m1(){
    	System.out.println("m1() called");
    }
    public static void m2(){
    	System.out.println("m2() called");
    }
    public static void m3(){
    	System.out.println("m3() called");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
			System.out.println("1.m1   2.m2   3.m3");
			System.out.println("Select option");
			int option = sc.nextInt();
			 switch(option){
			 case 1:m1();
			        break;
			 case 2:m2();
			        break;
			 case 3:m3();
			        break;
			 default:System.out.println("Invalid option");
			 
			 }
			 System.out.println("Do you want to continue:y/n");
			 ch = sc.next().charAt(0);
		}while(ch=='y');
		System.out.println("Thanks!!!!!");
		

	}

}
