package point01;

public class Phone extends Product {
	String bateryLife;

	public Phone(String code, String name, double price, String bateryLife) {
		super(code, name, price);
		this.bateryLife = bateryLife;
	}

	public String getBateryLife() {
		return bateryLife;
	}

	public void setBateryLife(String bateryLife) {
		this.bateryLife = bateryLife;
	}

}
