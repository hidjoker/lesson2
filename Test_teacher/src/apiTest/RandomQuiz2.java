package apiTest;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz2 {
	public static void main(String[] args) {
		
		// 가위바위보 게임 만들기
		
		// int user : 사용자입력 (1~3)
		// int com : 컴퓨터 랜덤 (1~3)
		
		// 1 : 가위, 2 : 바위, 3 : 보
		
		// I. Random을 이용하여 com에 값 저장
		// II. user에 입력받기
		// III. com, user 비교 (가위바위보 승부)
		// IV. 결과 출력 (승자)
		
		// V. I~IV 반복..
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int user; // 사용자
		int com; // 컴퓨터
		
		while(true) {
			com = ran.nextInt(3)+1;
			
			do {
//				System.out.println(com); //TEST
				System.out.print("가위바위보 입력(1~3) : ");
				user = sc.nextInt();
			} while(user<1 || user>3 );
			
			// 값 보정
			// 가위 1
			// 바위 2
			// 보 4
			if(user==3) user++;
			if(com==3)	com++; 
			
			System.out.println("사용자 : " + toHangul(user) );
			System.out.println("컴퓨터 : " + toHangul(com) );

			int res = user - com;
			
			if( res == 0 ) { // 비김
				System.out.println("비김");
			} else if( res==-3 || res==1 || res==2 ) {
				System.out.println("사용자 승");
			} else if( res==-1 || res==-2 || res==3) {
				System.out.println("컴퓨터 승");
			}

			System.out.println();
		} // while end - 무한반복
		
	}
	
	public static String toHangul(int num) {
		if(num==1)	return "가위";
		else if(num==2)	return "바위";
		else	return "보";
	}
}










