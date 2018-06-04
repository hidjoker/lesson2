package classBasic;

public class Calculator {
//	- 기능 : 사칙연산 계산기
// 	- 메소드 4개
//		sum, sub, mul, div
//	- 매개변수 : 정수 2개
//	- return : 정수 (div는 double)
	
//	  0. 메소드의 기본형태 작성
//		public void method() {
//		}
//	  1. 메소드 이름 정하기
//	  2. 매개변수 작성
//	  3. 코드 작성
//	  4. return 코드 작성
//	  5. return Type 
	
	public int sum(int n1, int n2) {
		return n1+n2;
	}

	public int sub(int n1, int n2) {
		return n1-n2;
	}

	public int mul(int n1, int n2) {
		return n1*n2;
	}

	public double div(int n1, int n2) {
		return n1/(double)n2; // int / int -> int
	}
	
}














