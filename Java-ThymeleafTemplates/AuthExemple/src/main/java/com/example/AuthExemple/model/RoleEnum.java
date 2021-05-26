package com.example.AuthExemple.model;

import javax.persistence.Entity;

import org.hibernate.metamodel.model.convert.spi.EnumValueConverter;


public enum RoleEnum {
	
	USER("USER"), ADMIN("ADMIN"), MANAGER("MANAGER");

	private final String nome;
	RoleEnum(){
		this.nome = "";
		}
	
	RoleEnum(String nome){
			this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
