package exception;

class EvenException extends Exception {
	
	@Override
	public String getMessage() {
		return "홀수입니다";
	}
	
}

class CheckEven {
	
	// 홀수를 입력하면 예외가 발생한다
	public void check(int num) throws EvenException {
		if( num%2 != 0 ) {	//홀수
			throw new EvenException();
		}
		
		System.out.println("짝수입니다!!!");
	}
	
}

public class ExceptionEx_10_CustumException {
	public static void main(String[] args) {

		CheckEven ce = new CheckEven();
		
		try {
			ce.check(13);
		} catch (EvenException e) {
//			e.printStackTrace();
			System.out.println( e.getMessage() );
//			System.out.println("홀수를 입력함..");
		}
		
	}
}














