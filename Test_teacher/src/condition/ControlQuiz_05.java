package condition;

import java.util.Scanner;

public class ControlQuiz_05 {
//	- 1에서부터 입력된 어떤 수까지 내에 있는 소수를
//	 찾는 프로그램을 작성하라.
//		* 소수 = 1 과 자신의 숫자로만 나누어 떨어지는 수
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		boolean flag = false; //소수판별 플래그
		
		for(int i=2; i<=num; i++) {
			flag = false;
			
			// 숫자 한 개에 대한 소수 판별
			for(int j=2; j<=i-1; j++) {
				if( i%j==0 ) {
					flag = true;
				}
			}
	
			if(flag == true) {
				System.out.println(i + " 은/는 소수가 아님");
			} else {
				System.out.println(i + " 은/는 소수");
			}
		}
		
	}
}















