package by.spring.project.perfomance;

public class Volunteer implements Thinker {

	private String thoughts;

	public void thinkOfSomthing(String thoughts) {
		this.thoughts = thoughts;

	}

	public String getThoughts() {
		return thoughts;
	}

}
