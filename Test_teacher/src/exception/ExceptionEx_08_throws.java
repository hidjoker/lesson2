package exception;

import java.io.IOException;

public class ExceptionEx_08_throws {
	public static void main(String[] args) {

		// throws �� ����� �޼ҵ带 ȣ���ϸ�
		// �ݵ�� ����ó���� �ؾ߸� �Ѵ�
		int input = -1;
		try {
			input = System.in.read();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}












