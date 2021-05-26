package br.com.ciceroednilson.webapp.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Table(name="tb_usuario", schema="cicero")
@Entity
public class UsuarioEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_id_usuario")
	@SequenceGenerator(name="seq_id_usuario", sequenceName="seq_id_usuario")  	
	@Column(name="id_usuario")
	private Long	codigo;
	
	@Column(name="ds_nome")
	private String	nome;
	
	@Column(name="ds_login")
	private String login;
	
	@Column(name="ds_senha")
	private String senha;
	
	@Column(name="fl_ativo")
	private boolean ativo;
		
    @JoinTable(name = "TB_USUARIO_X_GRUPO", 
    		joinColumns = {@JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")}, 
	 inverseJoinColumns = {@JoinColumn(name = "ID_GRUPO", referencedColumnName = "ID_GRUPO")}
    )
	@ManyToMany(cascade ={ CascadeType.PERSIST, CascadeType.MERGE})	
	private List<GrupoEntity> grupos;


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<GrupoEntity> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<GrupoEntity> grupos) {
		this.grupos = grupos;
	}
}
