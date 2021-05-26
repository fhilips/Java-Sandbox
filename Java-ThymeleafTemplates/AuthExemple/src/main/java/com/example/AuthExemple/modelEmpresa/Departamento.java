package com.example.AuthExemple.modelEmpresa;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long numeroDepartamento;
	private Date dataDeInicio;
	private String nome;
	
	@OneToOne
	private Funcionario gerente;
	
	@OneToMany(mappedBy = "departamento")
	private List<Projeto> projetos;
	
	@OneToMany(mappedBy = "departamento")
	private List<LocalizacoesDepartamento> localizacoes;
	
}
