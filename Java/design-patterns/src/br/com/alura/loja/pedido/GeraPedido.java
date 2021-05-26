package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedido {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;
	
	public GeraPedido(String clinte, BigDecimal valorOrcamento, int quantidadeItens) {
		super();
		this.cliente = clinte;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	
}