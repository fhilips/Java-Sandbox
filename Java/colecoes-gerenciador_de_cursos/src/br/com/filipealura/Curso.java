package br.com.filipealura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String Instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new LinkedHashSet<>();		// LinkedHashSet - hash set que implementa o hash de forma ordenada
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	public Curso(String nome, String instrutor) {

		this.nome = nome;
		Instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return Instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // não torna mais possivel alterar o valor fora da classe
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
		// return this.aulas.stream().flatMapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + "Instrutor: " + this.Instrutor + "Aulas: " + this.aulas;
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno a1) {
		return this.alunos.contains(a1);
	}

	public Aluno buscaMatriculado(int numero) {
		
		return matriculaParaAluno.get(numero);
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == numero) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException();
	}
	
	
}
