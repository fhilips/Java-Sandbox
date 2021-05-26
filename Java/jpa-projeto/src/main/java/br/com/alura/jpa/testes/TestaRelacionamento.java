package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.TipoMovimentacao;

public class TestaRelacionamento {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(125);
		conta.setNumero(1589185);
		conta.setAgencia(777173);
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setConta(conta);
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("Churrascaria");
		movimentacao.setValor(new BigDecimal(300.00));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		
		// em.persist(conta);
		//em.persist(movimentacao);
		
		Conta conta1 = em.find(Conta.class, 4L);
		
		em.getTransaction().begin();
		conta1.setTitular("Vagabondp");
		em.getTransaction().commit();
		
		em.close();

	}

}
