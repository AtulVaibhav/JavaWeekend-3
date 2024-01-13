package com.loops;

public class Test {
   public static int power(int num,int power){
	   int ans = 1;
	   for(int i=1;i<=power;i++){
		   ans = ans *num;
	   }
	   return ans;
   }
	public static void main(String[] args) {
		System.out.println(power(2,4));

	}

}
