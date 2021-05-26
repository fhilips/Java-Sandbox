package com.example.AuthExemple.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.AuthExemple.model.Gato;


public class ReqNovoGato {

	private Long id;
	private String nome;
	
	public ReqNovoGato() {
		
	}
	public ReqNovoGato(Gato gato) {
		gato.setId(this.id);
		gato.setNome(this.nome);
	}
	
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
	
	public Gato toGato() {
		Gato gato = new Gato();
		gato.setId(this.id);
		gato.setNome(this.nome);
		return gato;
	}
}
