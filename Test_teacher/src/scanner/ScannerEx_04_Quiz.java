package scanner;

import java.util.Scanner;

/*
 * Quiz
 * 가상인물의 개인정보를 입력받아 저장하고 출력하는 프로그램 작성
 */
public class ScannerEx_04_Quiz {
	public static void main(String[] args) {
		//1. 개인정보 변수 생성
		String name;	//이름
		int age;	//나이
		String gender;	//성별
		double height;	//키

		//2. 변수에 알맞은 Scanner 메소드 사용
		Scanner sc = new Scanner(System.in);
	
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		// 입력버퍼 문제 발생!!
		// 	 Scanner의 nextLine()을 제외한 nextXXX()계열
		//	메소드를 호출하면 버퍼에서 '개행문자(\r\n)'을
		//  처리하지 않고 남겨두게 된다
		//	 이후 nextLine()을 사용할 경우
		//	이전에 처리되지 않은 '개행문자(\r\n)'을 scan해버려서
		//	제대로 입력을 받지 않는 상황
		
		sc.nextLine();	//해결1. 버퍼의 \r\n을 입력받아 버린다
		sc.skip("\r\n");//해결2. 버퍼의 \r\n을 모두 지운다
		
		System.out.print("성별 입력 : ");
		gender = sc.nextLine();
		
		System.out.print("키 입력 : ");
		height = sc.nextDouble();
		
		//3. 출력
		System.out.println("--------------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
	}
}












