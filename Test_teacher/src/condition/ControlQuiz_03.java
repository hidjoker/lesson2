package condition;

import java.util.Scanner;

public class ControlQuiz_03 {
//	- 어떤 수의 약수를 구하는 프로그램을 작성하여라
//	약수 = 어떤 수를 정수로 나눌 수 있는 수
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		// 1부터 주어진 숫자까지 1씩 증가시키며 모든 정수를 나누었을 때
		// 나머지가 0인 숫자들(약수)들만 출력한다
		for(int i=1; i<=num; i++) { // 1 ~ num
			if( num%i==0 )
				System.out.println(i);
		}
		
	}
}















