package point06;

public class Product {
	String code;
	String name;
	float price;
	short stock;

	public Product(String code, String name, float price, short stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public short getStock() {
		return stock;
	}

	public void setStock(short stock) {
		this.stock = stock;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
