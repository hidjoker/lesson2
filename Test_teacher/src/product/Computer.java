package product;

public class Computer extends Product {
	
	// ������ -> ��ü�ʱ�ȭ -> ����ʵ�
	public Computer(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println("Computer");
	}
}






