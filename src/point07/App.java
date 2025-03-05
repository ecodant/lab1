package point07;

import java.util.LinkedList;

public class App {

	static LinkedList<String> bankClients = new LinkedList<String>();

	public static void main(String[] args) {

		bankClients.add("Client01");
		bankClients.add("Client02");
		bankClients.add("Client03");
		bankClients.add("Client04");
		bankClients.add("Client05");
		for (String client : bankClients) {
			System.out.println(client);
		}
		System.out.println("____________________________");
		// Metodo para añadir client de primeras en la cola del banco
		insertClientAtTheBegging("Client06");
		for (String client : bankClients) {
			System.out.println(client);
		}

	}

	public static void insertClientAtTheBegging(String client) {
		bankClients.addFirst(client);
	}

}
