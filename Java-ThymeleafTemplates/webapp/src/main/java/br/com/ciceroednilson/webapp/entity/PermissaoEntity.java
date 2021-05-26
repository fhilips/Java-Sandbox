package br.com.ciceroednilson.webapp.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="tb_permissao", schema="cicero")
@Entity
public class PermissaoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_permissao")
	@SequenceGenerator(name="seq_id_permissao", sequenceName="seq_id_permissao")  	
	@Column(name="id_permissao")	
	private Long codigo;
	
	@Column(name="ds_permissao")	
	private String permissao;
	
	@Column(name="ds_descricao")	
	private String descricao;	
	
	@ManyToMany(mappedBy = "permissoes")
	private List<GrupoEntity> grupos;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<GrupoEntity> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<GrupoEntity> grupos) {
		this.grupos = grupos;
	}
	
	
}
