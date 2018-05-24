package condition;

import java.util.Scanner;

public class IfQuiz_03 {
	// + 세수를 입력 받아 가장 큰 수를 출력하시오

	public static void main(String[] args) {

		// 1. 3개의 숫자를 저장할 변수 선언
		int num1, num2, num3;
		
		// 2. 데이터 입력 받기
		Scanner sc = new Scanner(System.in);//입력객체
		
		System.out.print("첫 번째 숫자 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		num2 = sc.nextInt();
		System.out.print("세 번째 숫자 입력 : ");
		num3 = sc.nextInt();
//		System.out.println("[TEST] "+num1+","+num2+","+num3);
		
		// 3. 가장 큰 수 판별
		int max;	// 가장 큰 값 저장
		
		if(num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		
		// 4. 결과 출력
		System.out.println(
			"세 숫자["+num1+","+num2+","+num3+"] 중 가장 큰 수 : "
					+ max);

	}
}











