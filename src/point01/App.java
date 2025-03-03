package point01;

import java.util.Iterator;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		TreeSet<Product> productsContainer = new TreeSet<>();
		Product laptoProduct = new Laptop("L01", "T490", 299.99, "500GB");
		Product phoneProduct1 = new Phone("P02", "Iphone 14", 345.23, "5000Mah");
		Product phoneProduct2 = new Phone("P05", "Iphone 15", 315.23, "5500Mah");
		Product phoneProduct3 = new Phone("P03", "Iphone 16", 335.23, "6000Mah");

		productsContainer.add(phoneProduct1);
		productsContainer.add(phoneProduct2);
		productsContainer.add(phoneProduct3);
		productsContainer.add(laptoProduct);

		Iterator<Product> iterator = productsContainer.iterator();
		Product foundProduct = searchProduct(iterator, "P05");
		if (foundProduct != null)
			System.out.println(foundProduct.getName());
		else
			System.out.println("Not found, bro");
	}

	public static Product searchProduct(Iterator<Product> it, String productCode) {
		while (it.hasNext()) {
			var currentElement = it.next();
			if (currentElement.getCode().equals(productCode))
				return currentElement;
		}
		return null;
	}
}
