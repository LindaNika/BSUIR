package by.spring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.spring.project.perfomance.Perfomer;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_container.xml"); 
		
		Perfomer p = (Perfomer) ac.getBean("Kenny");
		p.perfome();
	}

}
