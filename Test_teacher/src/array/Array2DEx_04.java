package array;

import java.util.Scanner;

public class Array2DEx_04 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		
		//arr[0][0] = 123;
		
		
		// 가변배열 //
		arr[0] = new int[4];
		arr[1] = new int[8];
		arr[2] = new int[6];
		
		for(int i=0 ; i<arr.length ; i++) {
			
			
			for(int j=0 ; j<arr[i].length ; j++) {
			
				System.out.print(arr[i][j]+" ");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
	}
}













