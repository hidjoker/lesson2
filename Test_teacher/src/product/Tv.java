package product;

public class Tv extends Product {
	
	// ������ -> ��ü�ʱ�ȭ -> ����ʵ�
	public Tv(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println("Tv");
	}
}


