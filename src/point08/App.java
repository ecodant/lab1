package point08;

public class App {

	public static void main(String[] args) {
		Editor editor = new Editor();

		editor.addToEditor("Texto de Prueba 1");
		editor.addToEditor("Texto de Prueba 2");
		editor.addToEditor("Texto de Prueba 3");

		// Deberia mostrar 3
		System.out.println(editor.getCurrentTextico());
		// Deberia quitar el 3 y mostrar el 2 entonces
		editor.undo();
		System.out.println(editor.getCurrentTextico());
		// Deberia quitar el 2 y mostrar el 1
		editor.undo();
		System.out.println(editor.getCurrentTextico());
	}

}
