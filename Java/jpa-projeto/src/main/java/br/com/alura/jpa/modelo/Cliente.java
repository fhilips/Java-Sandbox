package br.com.alura.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String endereco;
	private String proficao;
	
	@JoinColumn(unique = true)
	@OneToOne
	private Conta conta;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getProficao() {
		return proficao;
	}
	public void setProficao(String proficao) {
		this.proficao = proficao;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
}
