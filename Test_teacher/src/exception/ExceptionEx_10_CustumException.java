package exception;

class EvenException extends Exception {
	
	@Override
	public String getMessage() {
		return "Ȧ���Դϴ�";
	}
	
}

class CheckEven {
	
	// Ȧ���� �Է��ϸ� ���ܰ� �߻��Ѵ�
	public void check(int num) throws EvenException {
		if( num%2 != 0 ) {	//Ȧ��
			throw new EvenException();
		}
		
		System.out.println("¦���Դϴ�!!!");
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
//			System.out.println("Ȧ���� �Է���..");
		}
		
	}
}














