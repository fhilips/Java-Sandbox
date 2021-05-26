package com.example.AuthExemple.modelEmpresa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_projeto")
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numeroProjeto;
	private String localDoProjeto;
	
	@ManyToOne
	private Departamento departamento;
	
//	@ManyToMany
//	@JoinTable(name = "tb_trabalha_em",
//			joinColumns = @JoinColumn(name = "projeto_id"),
//			inverseJoinColumns = @JoinColumn(name = "funcionario_id"))
//	private List<Funcionario> funcionarios;
	
	@OneToMany(mappedBy = "projeto")
	private List<TrabalhaEm> funcionarios;
	
}
