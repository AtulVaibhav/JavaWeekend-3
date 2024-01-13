package com.arrays;

public class Rotation {
    public static void rotate(int[] arr,int k){
    	int count=1;
    	while(count<=k){
    		int temp=arr[arr.length-1];
        	for(int i=arr.length-1;i>0;i--){
        		arr[i] = arr[i-1];
        	}
        	arr[0] = temp;
        	count++;
    	}
    	for(int data:arr){
    		System.out.print(data+" ");
    	}
    }
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5};
		int k = 3;
		rotate(arr,k);

	}

}
