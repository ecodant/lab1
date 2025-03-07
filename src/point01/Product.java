package point01;

public abstract class Product implements Comparable<Product> {
	protected String code;
	protected String name;
	protected double price;

	public Product(String code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setId(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Product other) {
		return this.code.compareTo(other.code);
	}
}
