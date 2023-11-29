package projectdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import projectdtoo.shakthi1;

public class shakthi2 {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m1 = f.createEntityManager();
	EntityTransaction t = m1.getTransaction();

	public void insert(shakthi1 dto1) {
		t.begin();
		m1.persist(dto1);
		t.commit();

}
	

}
