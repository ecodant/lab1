package point14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MessageHistory {
	private Deque<String> messages = new ArrayDeque<>();

	public void sendMessage(String message) {
		messages.addLast(message);
	}

	public void showLastMessages() {
		System.out.println("Last Messages:");
		Iterator<String> it = messages.iterator();
		int count = 0;
		while (it.hasNext() && count < 10) {
			System.out.println(it.next());
			count++;
		}
	}

}
