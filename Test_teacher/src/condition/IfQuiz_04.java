package condition;

import java.util.Scanner;

public class IfQuiz_04 {
	//  + 두수를 입력 받아 합이 짝수이고 3의 배수인지 판별하시오

	public static void main(String[] args) {
		// 1. 두 수 변수 선언
		int num1, num2;
		
		// 2. 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		num2 = sc.nextInt();
//		System.out.println("[TEST] "+num1+","+num2);
		
		// 3. 합 구하기
		int sum = num1 + num2;
		
		// 4. 짝수면서 3의 배수인지 판별하기
		// 짝수는 2의 배수
		
		// 2의 배수와 3의 배수의 판별은 각 숫자로 나누었을 때
		// 나머지가 0인 것으로 판별한다
		
		// 짝수 판별 코드 : sum%2==0
		// 3의 배수 판별 코드 : sum%3==0
		boolean b = false; // 짝수이면서 3의배수인지 판단결과 저장
		if( sum%2==0 && sum%3==0 ) {
			b = true;
		}
		
		// 5. 결과 출력하기
		System.out.print("["+num1+"],["+num2+"] 의 합["
				+sum+"] 은/는 ");
		if( b == true ) {
			// 문제의 조건 만족
			System.out.println("짝수이면서 3의 배수이다");
		} else {
			// 조건 불만족
			System.out.println("짝수면서 3의 배수가 아니다");
		}
	}
}











