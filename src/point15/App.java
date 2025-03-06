package point15;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> directory = new HashMap<Integer, String>();

		directory.put(1234567, "Alice Smith");
		directory.put(9876543, "Bob Johnson");
		directory.put(5551212, "Charlie Brown");
		directory.put(1122334, "David Lee");
		directory.put(9988776, "Eve Wilson");

		/*
		 * Retornará un String con el nombre de la persona, dado que es uno de los
		 * numeros de arriba
		 */
		int searchNumber = 9876543;
		String foundName = searchPerson(directory, searchNumber);
		if (foundName != null) {
			System.out.println("Person with number " + searchNumber + ": " + foundName);
		} else {
			System.out.println("Person with number " + searchNumber + " not found.");
		}

		// Para un numero que no esta en el directorio returna null
		searchNumber = 1111111;
		foundName = searchPerson(directory, searchNumber);
		if (foundName != null) {
			System.out.println("Person with number " + searchNumber + ": " + foundName);
		} else {
			System.out.println("Person with number " + searchNumber + " not found.");
		}
	}

	public static String searchPerson(Map<Integer, String> directory, int number) {
		return directory.get(number);
	}
}
