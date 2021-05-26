package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCriaTabelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager createEntityManager = emf.createEntityManager();
        emf.close();
	}

}
