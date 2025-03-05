package point09;

import java.util.Scanner;
import java.util.Stack;

public class App {

	public static void main(String[] args) {
		/*
		 * Pequeño sistema que simula un navegador, si presiona 1 vuelve a la anterior
		 * pagina, borrando el string del stack, si presiona A es para añadir otro
		 * elemento al Stack y si presiona Q pues termina el while
		 */
		Scanner scanner = new Scanner(System.in);
		Stack<String> pagesHistoryStack = new Stack<String>();

		boolean flag = true;

		System.out.print("URL of the site: ");
		String userInput = scanner.nextLine();
		pagesHistoryStack.add(userInput);
		while (flag) {

			System.out.println("press `1` to go to the previus page, bro ");
			System.out.println("press `A` to go another page");
			System.out.println("press `Q` to go quit the browser, brocito");
			String options = scanner.nextLine().toUpperCase();
			switch (options) {
			case "A":
				System.out.print("Enter URL: ");
				String newUrl = scanner.nextLine();
				pagesHistoryStack.push(newUrl);
				break;
			case "1":
				if (pagesHistoryStack.size() > 1) {
					pagesHistoryStack.pop();
					System.out.println("We've went back, so the page right now is : " + pagesHistoryStack.peek());
				} else {
					System.out.println("No previous page.");
				}
				break;
			case "Q":
				flag = false;
				break;
			default:
				System.out.println("Invalid option.");
				break;
			}
		}
		scanner.close();
	}

}
