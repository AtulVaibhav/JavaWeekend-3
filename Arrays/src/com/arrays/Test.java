package com.arrays;

public class Test {

	public static void main(String[] args) {
		//data_type[] name = {};
		int[] arr= {21,22,23,24};
		
		//accessing elements
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//enhanced for-loop
         for(int data:arr){
        	 System.out.print(data+"\t");
         }
     	System.out.println();
         
         int[] arr2 = new int[5];
         for(int j=0, i=21;i<=25;i++,j++){
        	 arr2[j] = i;
         }
         
         for(int ele:arr2){
        	 System.out.print(ele+" "); 
         }
         
         
         
         
         
	}

}
