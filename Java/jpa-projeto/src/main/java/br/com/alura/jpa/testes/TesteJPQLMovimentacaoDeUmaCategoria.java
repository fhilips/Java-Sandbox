package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.Categoria;
import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;

public class TesteJPQLMovimentacaoDeUmaCategoria {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		Categoria categoria = new Categoria();
		categoria.setId(11L);

		String jpql = "select m from Movimentacao m join m.categoria c where c = :pCategoria";
		TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class);
		
		query.setParameter("pCategoria", categoria);		
		List<Movimentacao> resultList = query.getResultList();
		for (Movimentacao movimentacao : resultList) {
			System.out.println("Categorias: " + movimentacao.getCategoria());
			System.out.println("Descrição: " + movimentacao.getDescricao());
			System.out.println("Tipo: " + movimentacao.getTipoMovimentacao());
		}
	}

}
