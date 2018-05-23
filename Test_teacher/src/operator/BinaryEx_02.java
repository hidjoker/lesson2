package operator;

public class BinaryEx_02 {
	public static void main(String[] args) {

		// 관계연산자
		// 비교연산자
		
		// 이항연산자
		//	 왼쪽 항을 기준으로 오른쪽 항을 비교하여 true/false로
		//	관계에 대한 비교결과를 리턴(반환)한다
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));

		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		
		System.out.println("-----예외-----");
		
		// boolean
		System.out.println(true == true);
//		System.out.println(true < true);
		// boolean은 숫자로 취급되지 않는다
		
		// ** 참조형 에 관계연산을 함부로 하면 안됨
		
	}
}













