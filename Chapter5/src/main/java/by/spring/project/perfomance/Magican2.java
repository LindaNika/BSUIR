package by.spring.project.perfomance;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magican2 implements MindReader {
	
	@Pointcut("execution(* by.spring.project.perfomance.Thinker.thinkOfSomething(String)) && args(thoughts)")
	public void thinking(String thoughts){}

	private String thoughts;

	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercept Thought");
		this.thoughts = thoughts;

	}

	public String getThoughts() {
		return thoughts;
	}

}
