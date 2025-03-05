package point08;

import java.util.Vector;

public class Editor {
	private Vector<String> history;
	private String currentTextico;

	public Editor() {
		this.history = new Vector<>();
		this.currentTextico = "";
	}

	public void addToEditor(String text) {
//		System.out.println(text);
		history.add(text);
		currentTextico = text;
	}

	public void undo() {
		if (!history.isEmpty()) {
			currentTextico = history.lastElement();
			history.removeLast();
		} else {
			System.out.println("No changes to undo!");
		}
	}

	public String getCurrentTextico() {
		currentTextico = history.lastElement();
		return currentTextico;
	}

	public void setCurrentTextico(String currentTextico) {
		this.currentTextico = currentTextico;
	}
}
