package interfaceEx;

interface Inter_02 {
	public void out();
}
interface Inter_03 {
	public void out();
}
class Parent {
	public void out() {
		System.out.println("�θ�");
	}
}
class ClassTest extends Parent
			implements Inter_02, Inter_03 {
	@Override
	public void out() {
		System.out.println("�ڽ�");
	}
}

public class InterfaceEx_01 {
	public static void main(String[] args) {
		
		ClassTest ct = new ClassTest();
		ct.out();
		
	}
}


// ���߻�� - �ڹٴ� ���߻���� �����ϰ� ����
//class Parent1 {
//	public void out() {
//	}
//}
//class Parent2 {
//	public void out() {
//	}
//}
//
//class Child extends Parent1, Parent2 {
//	
//}















