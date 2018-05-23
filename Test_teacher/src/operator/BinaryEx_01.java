package operator;

public class BinaryEx_01 {
	public static void main(String[] args) {
		// 산술연산자
		int num1 = 17;
		int num2 = 4;
		
		int result = (num1 + num2);
		//int result = 17 + 4;
		//int result = 21;
		
		// ** 대입연산자 =
		// **	오른쪽 항의 값을 왼쪽 항의 변수에 저장한다
		
		System.out.println("결과 : " + result);
		
		System.out.println("-----");
		System.out.println(num1 + num2);//add(덧셈)
		System.out.println(num1 - num2);//sub(빼기)
		System.out.println(num1 * num2);//mul(곱하기)
		System.out.println(num1 / num2);//div(나누기)
		System.out.println(num1 % num2);//mod(나머지)
		
		System.out.println("-----");
		System.out.println(num1/(double)num2);//소수점이하 출력
						// 17/(double)4
						// 17.0/4.0
						// 4.2500000
		System.out.println((double)num1/num2);//소수점이하 출력
		
		System.out.println("-----");
		// double 데이터의 나머지 연산
		System.out.println(num1%2.4);
		
		System.out.println("--예외상황---");
		
		// divide by zero
//		System.out.println( 11 / 0 );//ArithmeticException
		
		System.out.println( 12.34 / 0 );//Infinity
	}
}













