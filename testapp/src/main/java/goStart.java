

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.relex.practice.pojo.Company;




public class goStart {

	public static void main(String[] args) {
	   //      System.out.println(System.getProperty("java.class.path").replace(';', '\n'));

		EntityManager entityManager;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PTTest");
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Company comp = new Company();
		comp.setName("PIROG");
		entityManager.persist(comp);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
