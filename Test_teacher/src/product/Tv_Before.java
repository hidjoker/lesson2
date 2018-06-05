package product;

public class Tv_Before {
	private String model;//¸ðµ¨¸í
	private int price;//°¡°Ý
	
	public Tv_Before(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public void out() {
		System.out.println("TV");
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














