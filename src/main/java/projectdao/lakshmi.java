package projectdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import projectdtoo.lakshmi1;

//import yuvanidhidto.yuvadto;

public class lakshmi {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m1 = f.createEntityManager();
	EntityTransaction t = m1.getTransaction();

	public void insert(lakshmi1 dto1) {
		t.begin();
		m1.persist(dto1);
		t.commit();

}

}
