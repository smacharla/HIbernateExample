package oracle.tms.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactoryRef;
	
	static {
		/*
		 * Configuration cfg= new Configuration(); cfg.configure();
		 * cfg.buildSessionFactory();
		 */
		sessionFactoryRef = new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactoryRef;
	}
}