package point04;

public class Task {
	String description;
	short importance;

	public Task(short importance, String description) {
		this.importance = importance;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getImportance() {
		return importance;
	}

	public void setImportance(short importance) {
		this.importance = importance;
	}

}
