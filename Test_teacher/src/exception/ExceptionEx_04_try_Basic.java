package exception;

public class ExceptionEx_04_try_Basic {
	public static void main(String[] args) {
	
		try {
			// try ���
			// ���ܰ� �߻��Ǵ� �ڵ�
			// ���� �߻��� �����Ǵ� �ڵ�
		} catch (ArithmeticException e) {
			// Arithmetic���� ó�� �ڵ�
			System.out.println("���� �߻�");
			
		} catch (NullPointerException e) {
			// NullPointer���� ó�� �ڵ�
			System.out.println("���� �߻�");
			
		} catch (Exception e) {
			// ���� catch�� ������ ������ ���� ó�� �ڵ�
			System.out.println("�������ϼ���");
			
		} finally {
			// ���ܹ߻��ص� ����
			// ���ܹ߻����� �ʾƵ� ����
			
			// �ڿ� ���� �ڵ�
		}
		
		System.out.println("����ó������ ��");
		
	}
}












