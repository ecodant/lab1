package point12;

import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		TreeSet<String> students = new TreeSet<>();

		students.add("Enrique");
		students.add("Petro");
		students.add("Bob");
		students.add("Juan");
		students.add("Robinson");

		// Estudiantes Ordenados
		System.out.println("Student Names (Alphabetical Order): " + students);

		// Para la parte de obtener facilmente el primer y ultimo nombre
		System.out.println("First Student: " + students.first());
		System.out.println("Last Student: " + students.last());
	}
}
