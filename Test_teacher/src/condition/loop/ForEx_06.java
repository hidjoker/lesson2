package condition.loop;

public class ForEx_06 {
	public static void main(String[] args) {
		// 구구단 2단을 출력
		
		// 출력 예시)
		//	2 x 1 = 2
		//	2 x 2 = 4
		//	...
		//	2 x 8 = 16
		//	2 x 9 = 18
		
		//반복횟수 : 9번
		//반복구간 : 1~9

		//초기식 : int i=1;
		//조건식 : i<=9; 
		//증감식 : i++
		
		for(int i=1; i<=9; i++) {
			System.out.println("2 x "+i+" = "+(2*i));
		}

	}
}














