package br.com.filipealura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.filipealura.Aula;
import br.com.filipealura.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando coleções", "filipe lok");
		
		
		// javaColecoes.getAulas().add(new Aula("teste 2", 55));
		
		javaColecoes.adiciona(new Aula("teste 753", 55));	
		javaColecoes.adiciona(new Aula("aula de cozinhar", 78));
		javaColecoes.adiciona(new Aula("vetores", 68));
		javaColecoes.adiciona(new Aula("mAtrixes", 44));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println(javaColecoes.getTempoTotal());
				
		System.out.println(javaColecoes);
		
	}

}
