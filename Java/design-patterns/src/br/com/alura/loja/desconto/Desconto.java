package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;


	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	
	}
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return afetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);	
	}
	protected abstract BigDecimal afetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);

}
