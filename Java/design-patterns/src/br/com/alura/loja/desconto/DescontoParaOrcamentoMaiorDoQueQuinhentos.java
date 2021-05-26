package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoMaiorDoQueQuinhentos extends Desconto {

	public DescontoParaOrcamentoMaiorDoQueQuinhentos(Desconto proximo) {
		super(proximo);		
	}

	@Override
	protected BigDecimal afetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
