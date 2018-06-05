package innerClass;

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















