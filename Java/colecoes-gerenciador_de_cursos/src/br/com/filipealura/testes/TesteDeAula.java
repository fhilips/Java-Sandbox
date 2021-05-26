package br.com.filipealura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.filipealura.Aula;

public class TesteDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("beta ", 55);
		Aula a2 = new Aula("aumento de casos ", 52);
		Aula a3 = new Aula("dotainha ", 53);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);							// reordena por ordem alfabetica. classe deve implementar a interface Comparator 
															// e sobreescrever o metodo compareTo com o criterio desejado
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));		// reordena pelo tempo
		aulas.sort(Comparator.comparing(Aula::getTempo));					// mesmo efeito da linha acima
		System.out.println(aulas);
	}

}
