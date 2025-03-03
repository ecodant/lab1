package point03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		// Dado que no especifica que tipo de Elementos, solo usé Stringcitos, profe
		Set<String> list = new HashSet<String>();

		list.add("Elementos");
		list.add("Separados");
		list.add("En");
		list.add("Palabras");
		list.add("Para");
		list.add("Test");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
