package condition.loop;

import java.util.Scanner;

public class WhileEx_01 {
	public static void main(String[] args) {
		
		// 반복문 while
		
		// while(조건식) {
		//		//조건식이 true이면 반복되는 문장
		// }
		
//		while(true) { // 무한 Loop
//			System.out.println("Hello");
//		}


//		for(초기식;조건식;증감식) { 
//		
//		}
	
//		초기식;
//		while(조건식) {
//			// 수행코드
//			
//			증감식;
//		}

		
		int i=0;
		
		while(i<10) {
			System.out.println(i);

			i++;
		}
		
		
		
		
		Scanner sc = new Scanner(System.in);

		String name = "";

		while( !name.equals("Alice") ) {
			name = sc.nextLine();
		}
	}
}












