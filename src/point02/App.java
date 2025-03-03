package point02;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Object> stackcito = new Stack<Object>();
		Dog dogcito = new Dog("Pitbull");
		Car car = new Car("2022", "Toyota");
		Book book = new Book("Titanic", "Someone");
		Book book2 = new Book("One Hundred Years of Solitude", "Someone");
		insertIntoStack(stackcito, book);
		// Este no se puede insertar, dado que no es de tipo "Car"
		insertIntoStack(stackcito, car);
		insertIntoStack(stackcito, book2);

		for (Object object : stackcito) {
			System.out.println(object);
		}
		System.out.println(stackcito.getLast());
	}

	public static void insertIntoStack(Stack<Object> stack, Object newElement) {
		if (!stack.isEmpty()) {
			if (stack.getLast().getClass().equals(newElement.getClass())) {
				stack.push(newElement);
				System.out.println("Element Inserted");
			} else
				System.out.println("The element doesn't match, therefore can't be inserted");

		} else {
			stack.add(newElement);
		}

	}
}
