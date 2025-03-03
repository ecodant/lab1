package point06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class App {
	static ArrayList<Product> shopProducts = new ArrayList<Product>();

	public static void main(String[] args) {

		Product product1 = new Product("P001", "Laptop", 1200.50f, (short) 50);
		Product product2 = new Product("P002", "Mouse", 25.99f, (short) 200);
		Product product3 = new Product("P003", "Keyboard", 50.00f, (short) 100);
		Product product4 = new Product("P004", "Monitor", 300.75f, (short) 25);
		Product product5 = new Product("P005", "Headphones", 79.95f, (short) 0);

		shopProducts.add(product1);
		shopProducts.add(product2);
		shopProducts.add(product3);
		shopProducts.add(product4);
		shopProducts.add(product5);
		// Methods para ordenar
//		orderByAlphabet();
//		orderLowerByPrice();
		checkForStock();
		// Imprimir la lista clasicamente con un loopcito
		for (Product product : shopProducts) {
			System.out.println(product.getName());
		}
		// Metodo para buscar products por su nombre (Deberia retornar el codigo del
		// product)
		Product foundProduct = searchForProduct("Laptop");
		if (foundProduct != null) {
			System.out.println(foundProduct.getCode());
		}
	}

	public static void checkForStock() {
		Iterator<Product> it = shopProducts.iterator();
		while (it.hasNext()) {
			if (it.next().getStock() == 0) {
				it.remove();
			}

		}
	}

	public static Product searchForProduct(String productName) {
		Iterator<Product> it = shopProducts.iterator();

		while (it.hasNext()) {
			Product currentElement = it.next();
			if (currentElement.getName().equals(productName))
				return currentElement;

		}
		return null;
	}

	public static void orderLowerByPrice() {
		Comparator<Product> com = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else if (o1.getPrice() < o2.getPrice()) {
					return -1;
				} else
					return 0;
			}
		};

		Collections.sort(shopProducts, com);
	}

	public static void orderByAlphabet() {
		Comparator<Product> com = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};

		Collections.sort(shopProducts, com);
	}

	public static void addProduct(Product product) {
		Iterator<Product> it = shopProducts.iterator();
		if (!shopProducts.contains(product)) {
			shopProducts.add(product);
			System.out.println("Product Added sucessfully");

		}

	}

}
