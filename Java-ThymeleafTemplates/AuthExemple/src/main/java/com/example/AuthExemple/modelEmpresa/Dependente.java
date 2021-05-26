package com.example.AuthExemple.modelEmpresa;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dependente")
public class Dependente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sexo;
	private Date dataDeNascimento;
	private String parentesco;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Funcionario funcionario;
}
