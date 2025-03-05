package point10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
	static Set<Employee> employees = new HashSet<Employee>();

	public static void main(String[] args) {
		Employee em1 = new Employee("Carlos", "12");
		Employee em2 = new Employee("Sofia", "34");
		Employee em3 = new Employee("Martha", "32");
		Employee em4 = new Employee("Pipe", "23");
		Employee em5 = new Employee("Lucho", "67");
		// Empleado repetido con diferente instancia pero mismos atributos
		Employee em6 = new Employee("Lucho", "67");

		employees.add(em1);
		employees.add(em2);
		employees.add(em3);
		employees.add(em4);
		employees.add(em5);
		employees.add(em6);

		// Validar Entrada de empleados
		System.out.println(employees.size());
		validateEntrance("67");
	}

	public static void validateEntrance(String employeeID) {
		Iterator<Employee> it = employees.iterator();

		while (it.hasNext()) {
			Employee currentEmployee = it.next();
			if (currentEmployee.getId().equals(employeeID)) {
				System.out.println("Is a registered Employee, allow Access");
			}

		}
	}

}
