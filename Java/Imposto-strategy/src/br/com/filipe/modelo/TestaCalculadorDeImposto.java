package br.com.filipe.modelo;

public class TestaCalculadorDeImposto {

	public static void main(String[] args) {
		Imposto icms = new Icms();
		Imposto ipta = new Ipta();
		
		Orcamento orcamento = new Orcamento(500.0);
		CalculaImposto calculadora = new CalculaImposto();
		
		
		System.out.println(calculadora.RealizaCalculo(orcamento, ipta));
		System.out.println(calculadora.RealizaCalculo(orcamento, icms));

	}

}
