package br.com.filipealura.testes;

import br.com.filipealura.Aluno;
import br.com.filipealura.Aula;
import br.com.filipealura.Curso;

public class TestaCursosComAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando coleções", "filipe lok");

		// javaColecoes.getAulas().add(new Aula("teste 2", 55));

		javaColecoes.adiciona(new Aula("teste 753", 55));
		javaColecoes.adiciona(new Aula("aula de cozinhar", 78));
		javaColecoes.adiciona(new Aula("vetores", 68));
		
		
		Aluno a1 =  new Aluno("charles boq", 4514);
		Aluno a2 = new Aluno("cabara lok", 5874);
		Aluno a3 = new Aluno("fio rino maquinario", 6699);
		Aluno a13 = new Aluno("fio rimmmmno maquinario", 6699);
		
		//javaColecoes.getAlunos().add(a13);
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		Aluno charles = new Aluno("charlesg boq", 4514);
		javaColecoes.matricular(charles);
		
		javaColecoes.getAlunos().forEach(aluno -> {System.out.println(aluno.getNome());});

		System.out.println(javaColecoes.estaMatriculado(charles));
		System.out.println(a1.equals(charles));
		
		
	}

}
