package array;

import java.util.Scanner;

public class Array2DEx_06 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// new int[5] ㅡ> int[0] = int[1] = int[2] = int[3] =int[4] =0(null)
		
		arr[0] = 10;
		arr[1] = 20;
		
		arr = new int[3];
		
		// 새로운 저장공간 reference값 받음. int[0] = int[1] = int[2] = 0(null)
		// jvm(GC_가비지컬렉션) ㅡ> 참조가 되지 않은 저장공간을 제거해줌
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]+ " ");
		}
		
		
		
		
	}
}













