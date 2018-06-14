package exception;

class ThrowEx {
	// str이 null이면 NullPointerException이 발생된다
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
			System.out.println("문자열로 null이 입력되었음");
		}
		
		System.out.println(" + + 프로그램 정상 종료 + +");
	}
}












