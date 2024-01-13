package com.loops;

public class Test5 {

	public static void main(String[] args) {
//		for(int i=1;i<=10;i++){
//			if(i==5) continue;
//			System.out.println("Hello "+i);
//		}
		
		for(int i=1;i<=5;i++){
			for(int j=11;j<=15;j++){
				if(j==13)break;
				System.out.println(i+" "+j);
			}
		}

	}

}
