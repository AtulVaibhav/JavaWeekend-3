package com.arrays;

public class SecondLargestElement {
   public static int secondLargest(int[] arr){
	   int largestElement =arr[0];
	   for(int i=1;i<arr.length;i++){
		   if(arr[i]>largestElement){
			   largestElement = arr[i];
		   }
	   }
	   int secondLargest=arr[0];
	   for(int i=1;i<arr.length;i++){
		   if(arr[i]>secondLargest && arr[i]<largestElement){
			   secondLargest = arr[i];
		   }
	   }
	   return secondLargest;
   }
	public static void main(String[] args) {
		int[] arr ={5,1,4,8,10,6};
		System.out.println(secondLargest(arr));
	}

}
