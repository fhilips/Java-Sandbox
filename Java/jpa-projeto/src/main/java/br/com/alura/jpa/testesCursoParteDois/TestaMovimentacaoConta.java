package br.com.alura.jpa.testesCursoParteDois;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;

public class TestaMovimentacaoConta {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		

		Movimentacao movimentacao = em.find(Movimentacao.class, 8L);
		Conta conta = movimentacao.getConta();		
		int quantidadeDeMovimentacoes = conta.getMovimentacoes().size();
		
		System.out.println(quantidadeDeMovimentacoes);
		
		
		
		

	}

}
