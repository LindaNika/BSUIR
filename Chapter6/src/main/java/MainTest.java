import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.bsuir.spring.spitter.HibernateSpitterDAO;
import by.bsuir.spring.spitter.SimpleJDBCTemplateSpitterDAO;
import by.bsuir.spring.spitter.Spitter;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		SimpleJDBCTemplateSpitterDAO dao = (SimpleJDBCTemplateSpitterDAO) ac.getBean("spitterDAO");
		
		
		HibernateSpitterDAO hDAO =  ac.getBean(HibernateSpitterDAO.class);
		
		Spitter s =  new Spitter("second", "second", "second");

		// dao.addSpitter(s);
		
		hDAO.addSpitter(s);

		System.out.println(dao.getSpitterById(1));

	}

}
