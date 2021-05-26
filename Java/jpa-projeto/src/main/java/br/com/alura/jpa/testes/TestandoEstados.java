package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
		// Transient
		Conta conta = new Conta();
		conta.setNumero(125);
		conta.setNumero(1589185);
		conta.setAgencia(777173);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		// Transient -> Managed
		em.persist(conta);
		// Managed -> Removed
		em.remove(conta);
		em.getTransaction().commit();
		
		
		
	}
}
