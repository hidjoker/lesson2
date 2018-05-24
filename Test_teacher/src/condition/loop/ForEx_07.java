package condition.loop;

public class ForEx_07 {

	public static void main(String[] args) {
		
	// 첫날에 10원을 예금하고,
	// 다음날에는 전날의 2배를 예금하는 방식으로
    // 보름(15일) 동안 저축한 금액은?

		
		// 반복횟수 : 14번
		// 반복구간 : 2~15

		// 초기식 : n=2
		// 조건식 : n<=15
		// 증감식 : n++
		
		
		// 1. 변수
		
		int won=10, sum=10;
		
		
		
		for(int n=2 ; n <= 15 ; n++) {
		
			won *= 2;
			sum += won;
			
		}
		
		System.out.println("저축한 금액은 : " + sum + "원");
	}
	
}
