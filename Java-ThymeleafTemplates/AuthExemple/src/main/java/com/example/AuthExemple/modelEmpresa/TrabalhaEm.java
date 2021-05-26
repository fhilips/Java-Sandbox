package com.example.AuthExemple.modelEmpresa;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_trabalha_em")
public class TrabalhaEm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date horas;
	
	@ManyToOne
	private Funcionario funcionario;
	
	@ManyToOne
	private Projeto projeto;
	
	
	
}
