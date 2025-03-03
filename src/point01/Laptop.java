package point01;

public class Laptop extends Product {
	String diskCapacity;

	public Laptop(String code, String name, double price, String diskCapacity) {
		super(code, name, price);
		this.diskCapacity = diskCapacity;
	}

}
