package array;

import java.util.Scanner;

public class Array2DEx_05 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		
		// new : 동적할당 연산자
		
		// 할당 : 메모리 공간 생성
		
		// 동적 <-> 정적
		// 동적 : 동작중, run-time
		// 정적 : 정지상태, Compile-time
				
		
		// ex) int num; // int형 변수 선언 -> 정적 할당
		
		// ex) int[] arr; // int[]형 변수 선언 -> 정적 할당
		//     arr = new int[5]; // int[5] 생성 -> 동적 할당
		
		// int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i <arr.length ; i++) {
			System.out.print("Input size : ");
			int len = sc.nextInt();
			
			arr[i] = new int[len];
		}
		
		
		
		
		
	}
}













