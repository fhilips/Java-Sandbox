package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaContaComSaldo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		
		Conta conta = em.find(Conta.class, 2L);
		
		conta.setTitular("Charles");
		conta.setNumero(158985);
		conta.setAgencia(77773);
		conta.setSaldo(500.00);
		
		em.getTransaction().begin();
		em.merge(conta);
		em.getTransaction().commit();
		em.close();
	}

}
