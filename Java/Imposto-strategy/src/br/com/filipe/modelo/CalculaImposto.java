package br.com.filipe.modelo;

public class CalculaImposto {

	public double RealizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		return imposto.calcula(orcamento);
	}

}
