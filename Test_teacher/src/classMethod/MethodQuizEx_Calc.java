package classMethod;

import java.util.Scanner;

import classBasic.Calculator;

public class MethodQuizEx_Calc {
	public static void main(String[] args) {
		// 정수 2개 입력
		// 연산자 기호 1개 입력
		
		// 연산자기호에 따른 정수 연산
		
		// 결과 출력
		
		
		
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		
		while(true) {
			
			// 연산자 기호 입력 받기
			System.out.print("연산자 입력 >> ");
			char oper = sc.nextLine().charAt(0);
			
			//잘못된 연산자 입력했을 때 처리
			if( oper!='+' && oper!='-' && oper!='*' && oper!='/' ) { 
				System.out.println("잘못된 연산기호 입력!!");
//				return;	// 메소드 중단
				break;	// 반복문 중단
			}
			
			// 정수 2개 입력 받기
			System.out.print("첫번째 숫자 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 입력 >> ");
			int num2 = sc.nextInt();
			
			sc.nextLine(); //버퍼비우기
			
			// TEST
	//		System.out.println("[TEST] "+oper+","+num1+","+num2);
			
			// 연산파트
			switch (oper) {
			case '+':
				System.out.println(
				"\n  RESULT >> "+num1+oper+num2+"="+c.sum(num1, num2));
				break;
	
			case '-':
				System.out.println(
				"\n  RESULT >> "+num1+oper+num2+"="+(num1-num2));
				break;
	
			case '*':
				System.out.println(
				"\n  RESULT >> "+num1+oper+num2+"="+(num1*num2));
				break;
	
			case '/':
				System.out.print(
				"\n  RESULT >> "+num1+oper+num2+"=");
				System.out.printf("%.2f", (num1/(double)num2));
				System.out.println();
				break;
	
	//		default:
	//			System.out.println("잘못된 연산기호 입력!!");
			}
		}
	}
}
















