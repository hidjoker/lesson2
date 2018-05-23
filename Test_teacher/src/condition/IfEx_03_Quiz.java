package condition;

import java.util.Scanner;

public class IfEx_03_Quiz {
	public static void main(String[] args) {

		// if 사용
		// 숫자 하나를 입력받아
		// 양수일 경우 "양수"라고 출력하고
		// 음수일 경우 "음수"라고 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Input Number : ");
		num = sc.nextInt();

		if(num>0) {
			System.out.println(num +"은/는 양수");
		}

		if(num<0) {
			System.out.println(num +"은/는 음수");
		}

		if(num==0) {
			System.out.println("입력한 숫자는 0입니다");
			System.out.println("0을 제외한 숫자만 넣어주세요");
		}
		
	}
}












