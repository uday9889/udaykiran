package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.*;
public class HibernateManager
{
	 Session session;

		public void connect()
		{
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
			ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
			SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
			session =sessionFactory.openSession();	
			System.out.println("Connected");
		}
		
		public void insert(Book e)
		{
		    session.beginTransaction();
			session.save(e);
		    session.getTransaction().commit();
			System.out.println("Object saved");
		}
}
