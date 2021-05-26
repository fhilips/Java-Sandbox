package br.com.alura.jpa.testesCursoParteDois;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.MediaComData;
import br.com.alura.jpa.modelo.dao.MovimentacaoDao;

public class TesteMediaDiariaDasMovimetacoes {

	public static void main(String[] args) {		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
		EntityManager em = emf.createEntityManager();
		
		List<MediaComData> mediaDasMovimentacoes = new MovimentacaoDao(em).getMediaDiariaDasMovimentacoes();
		
		for (MediaComData resultado : mediaDasMovimentacoes) {
			System.out.println("media: " + resultado.getDia() + " / " + resultado.getMes() + " é " + resultado.getValor());
		}
				

	}

}
