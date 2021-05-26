package br.com.filipealura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
	        throw new NullPointerException("Nome não pode ser nulo");
	    }
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	@Override
	public boolean equals(Object obj) {			// equals compara as referecias, sobreescrevendo com o criterio desejado
		Aluno aluno = (Aluno) obj;
		return this.getNome().equals(aluno.getNome());
	}
	@Override
	public int hashCode(){						// necessario implementar o metodo hashCode toda vez q o equals for sobrescrito, garantindo que a regra tenha o mesmo hash
	    return this.nome.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno: " + this.nome + " numero matricula: " + this.numeroMatricula;
	}
	
}
