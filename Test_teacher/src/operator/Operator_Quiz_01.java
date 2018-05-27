package operator;

import java.util.Scanner;

public class Operator_Quiz_01 {
	
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 입력 받기
		// 총점 계산
		// 평균 계산
		
		// 출력
		// 국어 : xxx
		// 영어 : xxx
		// 수학 : xxx
		// 총점 : xxx
		// 평균 : xx.xxxxxxxxx
		
		// **변수 다섯개 다 만들기
		
		// **추가문제
		//	- 평균 소숫점이하 둘째자리까지 표현가능하면 해보기
		//	- 찾아봐야할것...

		Scanner sc = new Scanner(System.in);
		System.out.print("Input Kor Score : ");		
		int kor=sc.nextInt();
		System.out.print("Input Eng Score : ");
		int eng=sc.nextInt();
		System.out.print("input Math Score : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)( kor + eng + math) /3;
		
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(Math.round(avg*100))/(double)100);
		System.out.printf("평점 :	%.2f",avg);
			
		
		
		
	
	
	
	}
}






