package operator;

public class BinaryEx_05 {
	public static void main(String[] args) {
		// 시프트 연산자, shift operator
		//	<<, >>, >>>
		
		// 왼쪽 시프트, left shift
		//	시프트한 숫자만큼 2를 제곱해서 곱한다
		int num = 7;
		System.out.println( num << 1 );
		System.out.println( num << 2 );
		System.out.println( num << 3 );
		System.out.println( num << 4 );
		System.out.println("-----");
		
		// 오른쪽 시프트, right shift
		num = 7;
		System.out.println( num >> 1 );
		System.out.println( num >> 2 );
		System.out.println( num >> 3 );
		System.out.println( num >> 4 );
		
		System.out.println("-----");
		num = -23;
		System.out.println(num>>2);

		num = -23;
		System.out.println(num>>>2);

	}
}














