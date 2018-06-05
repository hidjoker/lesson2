package product;

public class Computer_Before {
	private String model;
	private int price;
	
	public Computer_Before(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public void out() {
		System.out.println("Computer");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

















