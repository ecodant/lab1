package point04;

import java.util.Comparator;
import java.util.PriorityQueue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Task> p = new PriorityQueue<Task>(new Comparator<Task>() {

			@Override
			public int compare(Task o1, Task o2) {
				return Integer.compare(o1.getImportance(), o2.getImportance());
			}
		});

		Task t1 = new Task((short) 3, "Wash Dishes");
		Task t2 = new Task((short) 10, "Do the Homework");
		Task t3 = new Task((short) 5, "Watch The Game");
		Task t4 = new Task((short) 6, "Wash Cat");
		Task t5 = new Task((short) 1, "Wash Dog");

		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);
		p.add(t5);

		while (!p.isEmpty()) {
			System.out.println(p.poll().getDescription());
		}
	}

}
