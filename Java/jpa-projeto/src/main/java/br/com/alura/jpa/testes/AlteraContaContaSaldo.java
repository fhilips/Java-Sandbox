package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraContaContaSaldo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
			
		Conta contaDoFIlipe = em.find(Conta.class, 1L);

		em.getTransaction().begin();
		
		contaDoFIlipe.setSaldo(777.0);
		em.getTransaction().commit();
	}

}
