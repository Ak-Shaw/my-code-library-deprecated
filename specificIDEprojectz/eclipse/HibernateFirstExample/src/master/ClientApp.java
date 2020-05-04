package master;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientApp {

	public static void main(String[] args) {

		Customer cs1=new Customer();
		cs1.setCid("C4");
		cs1.setCname("Prashant");
		cs1.setCphno("798034");
		
		
		SessionFactory sessfact=new Configuration().configure().buildSessionFactory();
		
		Session session=sessfact.openSession();
		
		session.beginTransaction();
		
		session.save(cs1);
		
		session.getTransaction().commit();
	}

}
