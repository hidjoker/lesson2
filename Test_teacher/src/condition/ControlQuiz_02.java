package condition;

import java.util.Scanner;

public class ControlQuiz_02 {
//	- 입력받은 두수의 최소 공배수와 최대 공약수를 구하는 프로그램을 작성하라.
//	최소공배수 = 공배수 중에서 가장 작은 정수
//	최대공약수 = 공약수 중에서 절대치가 가장 큰 수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();

		// 최대공약수
		// num1		num2
		//	24		32
		
		//	1		1
		//	2		2
		//	3		4
		//	4		8
		//	6		16
		//	8		32
		//	12		
		//	24
		
		int min = num1<num2 ?num1 :num2;

//		방법1.
//		int gcd = 1;	//최대공약수
//		for(int i=1; i<=min; i++) {
//			if( num1%i==0 && num2%i==0 ) { // 공약수
//				gcd = i;
//			}
//		}
		
//		방법2.
		int gcd = 1;	//최대공약수
		for(int i=min; i>=1; i--) {
			if( num1%i==0 && num2%i==0 ) { // 공약수
				gcd = i;
				break;
			}
		}		
		System.out.println("최대공약수 : " + gcd);
	
		
		//최소공배수
		// 	num1	num2
		//	3		4
		
		//	3		4
		//	6		8
		//	9		12
		//	12		16
		//	15
		
		int max = num1>num2 ?num1 :num2;

		// 주어진 숫자 중 큰 값으로부터 1씩 증가시키면서
		// 두 숫자 모두에게 나누어 떨어지는 첫번째 값 -> 최소공배수
		for(int i=max; ; i++) {
			if( i%num1==0 && i%num2==0 ) {
				System.out.println("최소공배수 : " + i);
				break;
			}
		}
		
	}
}















