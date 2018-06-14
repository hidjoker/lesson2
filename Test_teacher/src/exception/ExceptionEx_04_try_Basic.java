package exception;

public class ExceptionEx_04_try_Basic {
	public static void main(String[] args) {
	
		try {
			// try 블록
			// 예외가 발생되는 코드
			// 예외 발생이 예측되는 코드
		} catch (ArithmeticException e) {
			// Arithmetic예외 처리 코드
			System.out.println("예외 발생");
			
		} catch (NullPointerException e) {
			// NullPointer예외 처리 코드
			System.out.println("예외 발생");
			
		} catch (Exception e) {
			// 위의 catch를 제외한 나머지 예외 처리 코드
			System.out.println("조심좀하세요");
			
		} finally {
			// 예외발생해도 실행
			// 예외발생하지 않아도 실행
			
			// 자원 해제 코드
		}
		
		System.out.println("예외처리구문 밖");
		
	}
}












