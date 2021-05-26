package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	
	private BigDecimal valor;
	private Integer quantidadeDeItens;
	private SituacaoOrcamento situacao;
	
	public Orcamento() {
		
	}
	public Orcamento(BigDecimal valor, Integer quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public Integer getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	
}
