package point10;

import java.util.Objects;

public class Employee {
	String name;
	String id;

	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/*
	 * Teste dos instancias diferentes de Employee con iguales atributos para
	 * comprobar duplicados y se guardaban en el HasSet por lo cual investigando
	 * explicaba que se debe sobreescribir los siguientes metodos para determinar si
	 * los objetos son considerados o no iguales
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return Objects.equals(name, employee.name) && Objects.equals(id, employee.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, id);
	}

}
