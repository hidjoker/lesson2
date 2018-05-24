package condition;

import java.util.Scanner;

public class IfQuiz_05 {
	// + 세 과목의 성적을 입력 받아 합계와 평균을 구하고 평균의 등급 출력

	public static void main(String[] args) {
		// 1. 세과목 성적 변수 선언
		int score1, score2, score3;
		
		// 2. 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Score1 : ");
		score1 = sc.nextInt();
		System.out.print("Input Score2 : ");
		score2 = sc.nextInt();
		System.out.print("Input Score3 : ");
		score3 = sc.nextInt();
//		System.out.println("[TEST] "+score1+","+score2+","+score3);
		
		// 3. 합계 구하기
		int sum = score1 + score2 + score3;
		
		// 4. 평균 구하기
		double avg = sum / (double)3;
		
//		System.out.println("[TEST] " + sum + "," + avg);
		
		// 5. 평균의 등급 구하기
		char grade = '\0'; // 널 문자, 아스키코드가 0 인 문자
		if( avg>=90 ) {
			grade = 'A';
		} else if( avg>=80 ) {
			grade = 'B';
		} else if( avg>=70 ) {
			grade = 'C';
		} else if( avg>=60 ) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		// 6. 등급 출력하기
		System.out.println(grade + " 등급입니다");
	}
}










