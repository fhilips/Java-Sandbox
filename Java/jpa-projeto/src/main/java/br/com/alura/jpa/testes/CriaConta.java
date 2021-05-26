package br.com.alura.jpa.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Movimentacao;

public class CriaConta {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
//		
//		Conta conta = new Conta();
//		conta.setTitular("Filipe2");
//		conta.setNumero(18840);
//		conta.setAgencia(666);

		Movimentacao movimentacao = new Movimentacao();
		movimentacao = em.find(Movimentacao.class,	6L);
		em.getTransaction().begin();
		
		
		movimentacao.setValor(new BigDecimal(400.00));
		movimentacao.setDescricao("Viagem a Sp nervosona");
		
		//em.find(conta.getClass(), 4L);
		//conta.setTitular("Jones Manoel");
		em.getTransaction().commit();
		em.close();
	}
}
