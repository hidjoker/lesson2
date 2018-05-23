package operator;

import java.util.Scanner;

public class Operator_Quiz_01_solve {
	public static void main(String[] args) {
		// 변수 생성
		int kor;	//국어점수
		int eng;	//영어점수
		int math;	//수학점수
		
		int sum;	//총점
		double avg;	//평균
		
		// 입력 객체 Scanner
		Scanner sc = new Scanner(System.in);
		
		// 점수 입력
		System.out.print("Input Korean : ");
		kor = sc.nextInt();
		System.out.print("Input English : ");
		eng = sc.nextInt();
		System.out.print("Input Mathematic : ");
		math = sc.nextInt();

		// 3과목 입력 TEST - 테스트완료
//		System.out.println("[TEST] "+kor+","+eng+","+math);

		// 총점, 평균 계산
		sum = kor + eng + math;	//총점 계산
		avg = sum / (double)3;	//평균 계산
		
		// 총점,평균 연산 TEST
//		System.out.println("[TEST] " + sum + ", " + avg);
		
		// 출력
		System.out.println("--------출력--------");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		System.out.println("총점 : " + sum);
		
		// 1. 원본 평균점수 출력
//		System.out.println("평균 : " + avg);
		
		// 2. 소숫점 둘째자리 평균점수 출력 - 1
		System.out.println("평균 : "
				+ Math.round(avg*100)/(double)100 );

		// 3. 소숫점 둘째자리 평균점수 출력 - 2
		System.out.printf("평균 : %.2f", avg);
		// printf - print formatted
		//	서식문자를 이용한 문자열 출력
		//	서식문자 - %s(문자열) %d(10진수) %c(문자) %f(실수)
	}
}
