package overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		Overloading_01 ol01 = new Overloading_01();
		
		System.out.println("display()");
		ol01.display();
		System.out.println("display(int,int)");
		ol01.display(10, 10);
		
		System.out.println("----------");
		Overloading_02 ol02 = new Overloading_02();
		
		System.out.println("���̴� : " + 
			ol02.getLength(112233) );
		
		System.out.println("123.4547�� ���̴� : " + 
			ol02.getLength(123.4547) );

		System.out.println("false�� ���̴� : " + 
				ol02.getLength(false) );

	}
}

class Overloading_01 {
	private int x;
	private int y;
	
	public void display() {
		System.out.println("["+x+","+y+"]");
	}
	
	// int�� �������� 2���� �Է¹ް�
	// ����ʵ� x, y�� �ʱ�ȭ�ϰ� ���
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
//		System.out.println("["+x+","+y+"]");
		display();
	}
	
	public void display(double d) { }
	public void display(String s) { }
	
	// �����ε��ȵ�
	//	����Ÿ���� �����ε����ǰ� ������
//	public int display() { }
}

class Overloading_02 {
	// �������� ���ڼ��� ���ؼ� ��ȯ
	//		112233 -> 6
	public int getLength(int num) {
//		String.valueOf(5000) -> "5000"
		
		String str = String.valueOf(num);
		return str.length();
	}
	
	public int getLength(double num) {
		String str = String.valueOf(num);
		return str.length();
	}

	public int getLength(boolean bData) {
		String str = String.valueOf(bData);
		return str.length();
	}

}


















