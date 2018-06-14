package exception;

import java.io.IOException;

public class ExceptionEx_08_throws {
	public static void main(String[] args) {

		// throws 가 적용된 메소드를 호출하면
		// 반드시 예외처리를 해야만 한다
		int input = -1;
		try {
			input = System.in.read();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}












