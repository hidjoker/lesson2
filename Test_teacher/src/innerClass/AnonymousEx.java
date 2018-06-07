package innerClass;

//+ ���� Ŭ����, Inner Class
//
//- Ŭ���� ���ο� ���ǵ� �ٸ� Ŭ����
//
//- 4���� ����
//1. ��� ��ø Ŭ����(= Instance Class)
//	: Ŭ������ ����� ���ǵ� ���� Ŭ����
//	  �ν��Ͻ� ������ ���� ����� ���Ѵ�
//	  ��ü���� �� �ܺ�Ŭ������ �ν��Ͻ��� ���� ������ �� �ִ�
//
//2. ���� ��ø Ŭ����(= Static Class)
//	: ��� ��ø Ŭ������ static Ű���带 ���� Ŭ����
//     ���� ����� ���� �� �ְ� �ȴ�
//
//3. ���� ��ø Ŭ����(= Local Inner Class)
//	: �޼ҵ��� ����������(Local Scope, �߰�ȣ ��)���� ���ǵ�
//     Ŭ����
//     �޼ҵ� �������� ����� �� �ִ� Ŭ����
//
//4. �͸� ��ø Ŭ����(= Anonymous Inner Class)
//   : Ŭ���� ���ǿ� ���ÿ� ��ü�� �����ϴ� ���
// 	 ��ü�� �ѹ� ������ �� ���� �ڵ带 ������ �� ����
//    (1ȸ�� Ŭ����)
//    �ַ� �������̽��� �̿��Ͽ� ���� �� ������ �Ѵ�
//    �̺�Ʈ�����ʸ� ������ �� ���Ǵ� �����̴�
//   **�̺�Ʈ������ : �̺�Ʈ�� ���� ������ ������ �ڵ�






interface Anonymous {
	void out();
}

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous an;
		an = new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 1��");
			}
		};
		an.out();
		
		Anonymous an2 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 2��");
			}
		};
		an2.out();
		
		
		new Anonymous() {
			@Override
			public void out() {
				System.out.println("�͸�ü 3��");
			}
		}.out();
		
		
		
//		class A {
//			public A() {
//		
//			}
//			public void out() {
//				
//			}
//		}
//		A a = new A();
//		a.out();
//		
//		new A().out();
		
	}
}















