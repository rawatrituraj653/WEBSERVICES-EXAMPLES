package com.universal.hibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private HibernateUtil() {}
	
	private static SessionFactory factory=null;
	
	public static synchronized SessionFactory getSessionFactory() {
			
		if(factory==null) {
		
		ServiceRegistry registry=
				new StandardServiceRegistryBuilder().configure("com/universal/hibernate/config/hibernate.cfg.xml").build();
		
		Metadata metadata=new MetadataSources(registry).getMetadataBuilder().build();
		
		factory=metadata.getSessionFactoryBuilder().build();			
	
		return factory;
		}
		else {
		return factory;
		}
	}
	
}
