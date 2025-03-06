package point16;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<Product> shoppingCart = new LinkedHashSet<Product>();

		Product product1 = new Product("Laptop", 1200.50f);
		Product product2 = new Product("Smartphone", 800.00f);
		Product product3 = new Product("Headphones", 99.9f);
		Product product4 = new Product("Keyboard", 50.7f);
		Product product5 = new Product("Mouse", 25f);

		/*
		 * Se asume que por escanear se refiere a ser añadidos al carrito, asi que solo
		 * se añadieron al Set
		 */

		shoppingCart.add(product1);
		shoppingCart.add(product2);
		shoppingCart.add(product3);
		shoppingCart.add(product4);
		shoppingCart.add(product5);

		System.out.println("The total of the Shopping Cart is: " + calculateTotal(shoppingCart));

	}

	public static float calculateTotal(Set<Product> products) {
		Iterator<Product> iterator = products.iterator();
		float total = 0;
		while (iterator.hasNext()) {
			total = total + iterator.next().getPrice();
		}
		return total;
	}

}
