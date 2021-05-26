package br.com.filipealura.testes;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "conhecendo mais lista";
		String aula2 = "modelando a classe Aula";
		String aula3 = "trabalhando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

//		aulas.remove(0);
		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println(aula);
		}
		System.out.println(aulas.size());

		aulas.forEach(aula -> {						// medoto foreach da classe ArrayList, usando lambdaexpression para listagem
			System.out.println("percorrendo: ");
			System.out.println("Aula: " + aula);
		});
		
		aulas.add("arturo tem que morr");		
		Collections.sort(aulas);				// classe Collections, metodo sort, para ordenar em ordem alfabetica
		System.out.println(aulas);
		
	}

}
