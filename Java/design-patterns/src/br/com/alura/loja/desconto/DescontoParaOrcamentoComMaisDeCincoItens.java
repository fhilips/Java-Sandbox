package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);		
	}


	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		
		return orcamento.getQuantidadeDeItens() > 5;
	}

	@Override
	protected BigDecimal afetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	
}
