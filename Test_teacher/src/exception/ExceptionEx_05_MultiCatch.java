package exception;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {
	
		try {
			System.out.println("try 블록");
		} catch (ArithmeticException | NullPointerException e) {
			// ArithmeticException 과
			// NullPointerException 모두 처리하는 예외처리코드
		}
		
	}
}












