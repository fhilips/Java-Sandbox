package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);		
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		
		return true;
	}

	@Override
	protected BigDecimal afetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	
}
