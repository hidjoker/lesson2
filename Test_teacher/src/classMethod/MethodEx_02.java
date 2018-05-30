package classMethod;

import java.util.Scanner;

public class MethodEx_02 {
	public static void main(String[] args) {
		
		Method_02 m02 = new Method_02();
		
		m02.print100();
		System.out.println("------------");
//		m02.printApple(5);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력할까요? ");
		m02.printApple( sc.nextInt() );
		
		System.out.println("------------");
//		m02.printString(5, "Banana");
		
		System.out.print("몇번 출력할까요? ");
		int cnt = sc.nextInt();

		sc.nextLine();
		
		System.out.print("어떤 문구를 출력할까요? ");
		String str = sc.nextLine();
		m02.printString(cnt, str);
		
	}
}
















