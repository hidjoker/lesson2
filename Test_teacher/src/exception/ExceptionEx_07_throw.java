package exception;

class ThrowEx {
	// str�� null�̸� NullPointerException�� �߻��ȴ�
	public void print(String str, int cnt) {
		
		if( str == null ) 
			throw new NullPointerException();
		
		for(int i=0; i<cnt; i++) {
			System.out.println(str);
		}
	}
}
public class ExceptionEx_07_throw {
	public static void main(String[] args) {

		ThrowEx te = new ThrowEx();
		
		String str = null;
		
		try {
			te.print(str, 3);
		} catch (NullPointerException e) {
			System.out.println("���ڿ��� null�� �ԷµǾ���");
		}
		
		System.out.println(" + + ���α׷� ���� ���� + +");
	}
}












