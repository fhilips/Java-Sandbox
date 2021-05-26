package rc.bootsecurity.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role",
    joinColumns=
        @JoinColumn(name="user_id", referencedColumnName="id"),
    inverseJoinColumns=
        @JoinColumn(name="role_id", referencedColumnName="id"))	
	private List<User> users = new ArrayList<User>();

	
	public Role(String nome) {
		this.nome = nome;
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


	
	
	
	
}
