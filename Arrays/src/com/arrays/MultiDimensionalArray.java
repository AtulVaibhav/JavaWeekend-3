package com.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},
				       {11,12},
				       {21,22,23},
				       {31}};
       System.out.println("Number of rows "+arr.length);
       System.out.println("Number of cols  :"+arr[0].length);
       
       for(int i=0;i<arr.length;i++){
    	   for(int j=0;j<arr[i].length;j++){
    		   System.out.print(arr[i][j]+"    ");
    	   }
    	   System.out.println( );
       }
	}

}
