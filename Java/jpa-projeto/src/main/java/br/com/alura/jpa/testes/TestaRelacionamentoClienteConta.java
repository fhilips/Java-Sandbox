package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;

public class TestaRelacionamentoClienteConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
	
//
//		Cliente cliente = new Cliente();
//		cliente.setNome("chorao vagabundo nervoso");
//		cliente.setProficao("vagaboond2");
//		cliente.setEndereco("augusta");
//		cliente.setConta(conta);
		conta = em.find(Conta.class, 5L);
		
		
		
		em.getTransaction().begin();

		conta.setAgencia(5556666);
		conta.setNumero(566664);
		conta.setTitular("rlos");
		conta.setSaldo(6886.5);
		
		em.getTransaction().commit();
		em.close();
	}

}
