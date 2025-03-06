package point17;

import java.time.LocalDate;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		TreeMap<LocalDate, Event> eventList = new TreeMap<LocalDate, Event>();

		Event event1 = new Event("Birthday Party", LocalDate.of(2023, 12, 25));
		Event event2 = new Event("Team Meeting", LocalDate.of(2024, 1, 10));
		Event event3 = new Event("Product Launch", LocalDate.of(2024, 2, 15));
		Event event4 = new Event("Conference", LocalDate.of(2024, 3, 20));

		// Se indica el key que tendra el map en este caso sus fechas
		eventList.put(event1.getDate(), event1);
		eventList.put(event2.getDate(), event2);
		eventList.put(event3.getDate(), event3);
		eventList.put(event4.getDate(), event4);
		// Eventos proximos
		eventList.forEach((date, event) -> System.out.println(event.getName() + " on " + date));

	}

}
