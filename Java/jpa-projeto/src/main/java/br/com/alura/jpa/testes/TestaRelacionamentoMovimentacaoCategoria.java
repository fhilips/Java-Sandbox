package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Categoria;
import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.TipoMovimentacao;

public class TestaRelacionamentoMovimentacaoCategoria {

	public static void main(String[] args) {
		
		Categoria categoria1 = new Categoria("Viagem");
		Categoria categoria2 = new Categoria("Negocios");
		
		Conta conta = new Conta();
		
		
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("Viagem a SP");
		movimentacao.setValor(new BigDecimal(300.00));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setCategoria(Arrays.asList(categoria1, categoria2));
		movimentacao.setConta(conta);
		
		Movimentacao movimentacao2 = new Movimentacao();
		
		movimentacao2.setData(LocalDateTime.now());
		movimentacao2.setDescricao("Viagem a RJ");
		movimentacao2.setValor(new BigDecimal(300.00));
		movimentacao2.setTipoMovimentacao(TipoMovimentacao.SAIDA);	
		movimentacao2.setCategoria(Arrays.asList(categoria1, categoria2));
		movimentacao2.setConta(conta);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.persist(categoria1);
		em.persist(categoria2);
		
		em.persist(movimentacao);
		em.persist(movimentacao2);
		
		em.getTransaction().commit();
		em.close();
	}

}
