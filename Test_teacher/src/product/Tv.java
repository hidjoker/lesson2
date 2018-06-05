package product;

public class Tv extends Product {
	
	// 생성자 -> 객체초기화 -> 멤버필드
	public Tv(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println("Tv");
	}
}


