package com.arrays;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		
		int[] arr= new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Displaying the elements :");
		for(int data:arr){
			System.out.print(data+" ");
		}
		System.out.println();

	}

}
