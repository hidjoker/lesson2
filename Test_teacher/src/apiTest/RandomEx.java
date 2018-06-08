package apiTest;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		// import 최적화
		// ctrl + shift + o
		
		Random ran = new Random();
		System.out.println( ran.nextInt() );
		System.out.println( ran.nextDouble() );
		System.out.println( ran.nextBoolean() );
		
		System.out.println("--------");
		System.out.println( ran.nextInt(10) );//0~9
		System.out.println( ran.nextInt(10)+1 );//1~10
		
		System.out.println( ran.nextInt(5) );//0~4
		System.out.println( ran.nextInt(5)+11 );//11~15
		
		System.out.println("---------");
		int[] arr = new int[5];
		
		// 1~100 난수를 5개 int[] 에 담기
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100)+1;//1~100난수
		}
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}
}














