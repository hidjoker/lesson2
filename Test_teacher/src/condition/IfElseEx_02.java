package condition;

import java.util.Scanner;

public class IfElseEx_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Input Number : ");
		num = sc.nextInt();

		if(num>0) {
			System.out.println(num +"은/는 양수");
		} else {
			System.out.println(num +"은/는 양수가 아니다");
		}

	}
}







