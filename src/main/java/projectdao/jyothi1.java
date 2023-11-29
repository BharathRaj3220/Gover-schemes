package projectdao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import projectdtoo.gruhajyothi1;
import projectdtoo.gruhajyothi1;

//import yuvanidhidto.yuvadto;

public class jyothi1 {
	EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
	EntityManager m1 = f.createEntityManager();
	EntityTransaction t = m1.getTransaction();

	public void insert(gruhajyothi1 dto1)
	{
		t.begin();
		m1.persist(dto1);
		t.commit();
	}

}
