

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import javax.persistence.spi.PersistenceProvider;

import org.hibernate.Hibernate;
import org.hibernate.ejb.HibernatePersistence;
import org.hibernate.jpa.HibernatePersistenceProvider;

import com.relex.practice.pojo.Company;




public class goStart {

	public static void main(String[] args) {
	         //  System.out.println(System.getProperty("java.class.path").replace(';', '\n'));
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PTTest");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityManager
		entityManager.getTransaction().begin();
		Company comp = new Company();
		comp.setName("PIROG");
		entityManager.persist(comp);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
