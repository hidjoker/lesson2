package classMethod;

public class Method_02 {
	
//	1. 1~100까지 정수를 출력하는 기능
	public void print100() {
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
//	2. 전달받은 정수 값만큼 "Apple" 반복 출력
	public void printApple(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.println("Apple");
		}
	}

	
//	3. 첫번째로 전달받은 정수 값만큼
//	   두번째로 전달받은 문자열을 반복 출력
	public void printString(int cnt, String str) {
		for(int i=0; i<cnt; i++) {
			System.out.println(str);
		}
	}
	
}














