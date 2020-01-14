package data;

public class Item {

	private String type;
	private int price;
	
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	
}
