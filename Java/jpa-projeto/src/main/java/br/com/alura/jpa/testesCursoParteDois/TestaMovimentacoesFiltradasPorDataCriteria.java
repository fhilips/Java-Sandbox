package br.com.alura.jpa.testesCursoParteDois;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TestaMovimentacoesFiltradasPorDataCriteria {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		MovimentacaoDao movimentacaoDao = new MovimentacaoDao(em);
		List<Movimentacao> movimentacoesFiltradasPorData = 
				movimentacaoDao.getMovimentacoesFiltadasPorData(null, null, null);
		
		for (Movimentacao movimentacao : movimentacoesFiltradasPorData) {
			System.out.println("Descricão: " + movimentacao.getDescricao());
			System.out.println("valor: " + movimentacao.getValor());
			System.out.println("--------------");
		}
	}

}
