package operator;

public class UnaryEx_02 {
	public static void main(String[] args) {
		
		// 비트단위 not 연산자
		//	1의보수 생성
		//	~
		
		// 비트들을 모두 0->1 , 1->0 으로 변환
		
		byte num = 7;
		System.out.println( ~num );//1의보수
		System.out.println( ~num + 1 );//2의보수
		
	}
}










