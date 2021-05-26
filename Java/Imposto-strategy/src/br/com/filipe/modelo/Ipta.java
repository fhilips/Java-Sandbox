package br.com.filipe.modelo;

public class Ipta implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.8;
	}

}
