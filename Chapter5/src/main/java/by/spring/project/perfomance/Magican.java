package by.spring.project.perfomance;

public class Magican implements MindReader {

	private String thoughts;

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;

	}

	public String interactThoughts() {
		return thoughts;
	}

}
