package by.bsuir.spring.spitter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateSpitterDAO {
	
	
	private SessionFactory sessionFactory;
	
	
	
	public HibernateSpitterDAO(){}
	public HibernateSpitterDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void addSpitter(Spitter s){
		currentSession().save(s);
	}
	
	public Spitter getSpitterById(long id){
		return (Spitter) currentSession().get(Spitter.class, id);
	}
	
	public void saveSpitter(Spitter s){
		currentSession().update(s);
	}
	

}
