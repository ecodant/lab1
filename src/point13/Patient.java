package point13;

class Patient implements Comparable<Patient> {
	private String name;
	private int severity;

	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	@Override
	public int compareTo(Patient other) {
		return Integer.compare(this.severity, other.severity);
	}

}