package com.example.AuthExemple.modelEmpresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cpf;
	private LocalDate dataDeNascimento;
	private String nome;
	private String endereco;
	private Double salario;
	private String sexo;
	@OneToOne
	private Funcionario cpfSupervisor;
	
	@OneToOne(mappedBy = "gerente")
	private Departamento gerenciaDepartamento;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<Dependente> dependentes;
	
//	@ManyToMany(mappedBy = "funcionarios")
//	private List<Projeto> projetos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<TrabalhaEm> projetos;
}
