package generics;

class Class05 {
	
	public <T> T out(T obj) {
		System.out.println("���׸� �޼ҵ�");
		System.out.println("������ : " + obj);
		
		T data = obj;
		
		return obj;
	}
	
	public <T> void display(Integer num) {
		
		T data;

		data = (T)num;
		
	}
}

public class GenericsEx_05_GenericMethod {
	public static void main(String[] args) {
		
		Class05 c05 = new Class05();
		
		c05.out(123);	// �ڵ����� T �� Integer�� ������
		c05.out("Alice"); // �ڵ����� String���� ����
		
		c05.<Integer>out(555); // ��������� T�� Integer�� ����
//		c05.<Integer>out("Bob"); // String ���� �Ұ�
		
		c05.<String>display(8989);
		
	}
}














