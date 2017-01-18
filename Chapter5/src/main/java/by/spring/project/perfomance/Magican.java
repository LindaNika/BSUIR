package by.spring.project.perfomance;

public class Magican implements MindReader {

	private String thoughts;

	public void interceptThoughts(String thoughts) {
		System.out.println("Intercept Thought");
		this.thoughts = thoughts;

	}

	public String getThoughts() {
		return thoughts;
	}

}
