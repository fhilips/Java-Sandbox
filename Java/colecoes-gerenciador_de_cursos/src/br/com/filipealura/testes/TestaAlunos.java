package br.com.filipealura.testes;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		
		 alunos.add("Rodrigo Turini");
		    alunos.add("Alberto Souza");
		    alunos.add("Nico Steppat");
		    alunos.add("Sergio Lopes");
		    alunos.add("Renan Saggio");
		    alunos.add("Mauricio Aniche");

		    for (String aluno : alunos) {
		        System.out.println(aluno);
		    }

		    System.out.println(alunos);  
		

	}

}
