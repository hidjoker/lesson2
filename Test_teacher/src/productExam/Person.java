package productExam;

import product.Product;

public class Person {
	private String name;
	private int money;
	
	private Product prod;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	// ����� ������ ��� ����
	public void buy(Product p) {
		money -= p.getPrice();
		prod = p;
		
		System.out.println(name+"���� "
				+p.getPrice()+"���� �����ϰ� "
				+p.getModel()+" ������");
		System.out.println("[�ܾ�] "+money+"��");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	
}















