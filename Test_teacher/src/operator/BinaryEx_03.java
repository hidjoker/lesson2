package operator;

public class BinaryEx_03 {
	public static void main(String[] args) {
		// 복합 대입 연산자
		// 산술 대입 연산자
		//	대입연산자와 다른 연산자를 조합해서 쓰는 것
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("-----연산 전-----");
		System.out.println("num1="+num1+",num2="+num2);

//		num2 += num1;
		// num2 = num2 + num1;

//		num2 -= num1;
//		num2 *= num1;
//		num2 /= num1;
		num2 %= num1;

		System.out.println("-----연산 후-----");
		System.out.println("num1="+num1+",num2="+num2);
	}
}











