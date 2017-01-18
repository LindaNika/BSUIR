package by.spring.project;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.spring.project.perfomance.Instrument;
import by.spring.project.perfomance.MindReader;
import by.spring.project.perfomance.Perfomer;
import by.spring.project.perfomance.Thinker;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_container.xml"); 
		
		Perfomer p = (Perfomer) ac.getBean("Kenny");
		p.perfome();
		
		Thinker t = (Thinker) ac.getBean("volunteer");
		t.thinkOfSomething("HELLO");
		
		MindReader m = (MindReader) ac.getBean("magician");
		System.out.println(m.getThoughts());
	}

}
