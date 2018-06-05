package product;

public class Computer extends Product {
	
	// 생성자 -> 객체초기화 -> 멤버필드
	public Computer(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println("Computer");
	}
}






