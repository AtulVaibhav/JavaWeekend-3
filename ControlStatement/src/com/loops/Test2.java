package com.loops;

public class Test2 {
   public static int sumOfDigit(int num){
	   int sum=0;
	   while(num>0){
		   int rem = num%10;
		   num = num/10;
		   sum += rem;
	   }
	   return sum;
   }
	public static void main(String[] args) {
		int num = 23657;
		System.out.println(sumOfDigit(num));
	}

}
