package array;

import java.util.Scanner;

public class ArrayQuiz_01_ManagementExpense {
	
	// 1인당 관리비
	public static final int FEE = 13000;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] people = new int[6];	//각층의 인원 + 총인원
		int[] expense = new int[6];	//각층의 관리비 + 총관리비
		
		System.out.println("-- 각 층의 인원 입력 --");
		
		for(int i=0; i<5; i++) {
			System.out.print( (i+1) + "층의 인원은? ");
			// 각 층의 인원 입력
			people[i] = sc.nextInt();
			
			people[5] += people[i];	// 총 인원 구하기
		}
//		people[5] = people[0] + people[1] + people[2] + people[3] + people[4]; 

		// 관리비 구하기
		for(int i=0; i<6; i++) {
			expense[i] = people[i] * FEE;
		}
		
		// 관리비 출력
		System.out.println("\n-- 각 층의 관리비 출력 --");
		for(int i=0; i<5; i++) {
			System.out.println(
				(i+1) + "층의 관리비 : "
				+ expense[i] + "원");
		}
		
		// 최종 출력
		System.out.println("\n총 인원은 " + people[5] + "명 입니다");
		System.out.println("총 관리비는 " + expense[5] + "원 입니다");
		
	}
}












