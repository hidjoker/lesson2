package classMethod;

public class Method_01 {
	
	public void method01() {
		System.out.println("Hello");
	}
	
	public void method02( int parameter ) {
		System.out.println("�������� �� : " + parameter);
	}
	
	public void method03( int num, String str ) {
		System.out.println(num+","+str);
	}
	
	public int returnNum() {
		System.out.println("��ȯ(return)�� �����ϴ� �޼ҵ�");
		
		return 33;
	}
	
	public int add(int n1, int n2) { //�޼ҵ� ���, ���Ǻ�
		
		// �޼ҵ��� �ٵ�, ������
		int result;
		result = n1 + n2;
		
		return result;
	}
	
	
	// ���� ���
	public int minus(int num1, int num2) {
		
		return num1-num2;
		
	}

	
}
















