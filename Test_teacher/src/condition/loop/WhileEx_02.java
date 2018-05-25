package condition.loop;

public class WhileEx_02 {
	public static void main(String[] args) {
		
		// while 문 이용

		// 1번. 0~9까지 출력
		//반복횟수 : 10번 
		//반복구간 : 0~9

		//초기식 : i=0;
		//조건식 : i<10;
		//증감식 : i++;
		
		int i=0;//초기식
		while(i<10) { //조건식
			
			// 수행 코드
			System.out.println(i);
			
			i++;//증감식
		}
		System.out.println("-----");
		
		// 2번. Hello 6번 출력하기
		i=0;//초기식
		while(i<6) { //조건식
			
			// 수행 코드
			System.out.println("Hello");
			
			i++;//증감식
		}
		System.out.println("-----");
		
		// 3번. 5 4 3 2 1 0 으로 출력하기
		//반복횟수 : 6
		//반복구간 : 5 -> 0

		//초기식 : i = 5;
		//조건식 : i >= 0
		//증감식 : i--;
		
		i = 5;
		while(i >= 0) {
			System.out.println(i);
			i--;
		}
	}
}















