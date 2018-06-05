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
	
	
	// 사람이 물건을 사는 행위
	public void buy(Product p) {
		money -= p.getPrice();
		prod = p;
		
		System.out.println(name+"님이 "
				+p.getPrice()+"원을 지불하고 "
				+p.getModel()+" 구매함");
		System.out.println("[잔액] "+money+"원");
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















