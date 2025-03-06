package point14;

public class App {

	public static void main(String[] args) {
		MessageHistory chat = new MessageHistory();

		// Alguno mensajes random un tanto breves
		for (int i = 1; i <= 12; i++) {
			chat.sendMessage("Message " + i);
		}

		// Mostrará solo los ultimos 10 mensajes del chat
		chat.showLastMessages();
	}

}
