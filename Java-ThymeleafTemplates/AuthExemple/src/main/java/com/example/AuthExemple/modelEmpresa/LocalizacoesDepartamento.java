package com.example.AuthExemple.modelEmpresa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_localizacao_departamento")
public class LocalizacoesDepartamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String local;
	
	@ManyToOne
	private Departamento departamento;
	
}
