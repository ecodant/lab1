package point13;

import java.util.PriorityQueue;

public class App {

	public static void main(String[] args) {
		PriorityQueue<Patient> patientQueue = new PriorityQueue<>();

		patientQueue.add(new Patient("John Doe", 3));
		patientQueue.add(new Patient("Jane Smith", 1));
		patientQueue.add(new Patient("Emily Davis", 4));
		patientQueue.add(new Patient("Mike Brown", 2));

		// Pacientes por prioridad
		System.out.println("Attending Patients in Priority Order:");
		while (!patientQueue.isEmpty()) {
			System.out.println(patientQueue.poll().getName());
		}

	}

}
