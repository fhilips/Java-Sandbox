package com.example.AuthExemple.model;

import javax.persistence.*;

import org.springframework.context.support.BeanDefinitionDsl.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Telefone> telefone = new ArrayList<Telefone>();

    private int active;
    
    @ManyToOne(cascade=CascadeType.ALL)
    private Roles role;

    private String permissions = "";
    @Enumerated
    private RoleEnum enumRole = RoleEnum.USER;

    public User(String username, String password, Roles role, String permissions){
        this.username = username;
        this.password = password;
        this.role = role;
        this.permissions = permissions;
        this.active = 1;
    }

    
    public User(){}

    
    public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone.add(telefone);
	}
	
    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getActive() {
        return active;
    }

    public Roles getRoles() {
        return role;
    }

    public String getPermissions() {
        return permissions;
    }

    public List<String> getRoleList(){
//        if(this.roles.length() > 0){
//            return Arrays.asList(this.roles.split(","));
//        }
    	
        return new ArrayList<>();
    	
    }

    public List<String> getPermissionList(){
        if(this.permissions.length() > 0){
            return Arrays.asList(this.permissions.split(","));
        }
        
        return new ArrayList<>();
    }


	public void setId(long id) {
		this.id = id;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setActive(int active) {
		this.active = active;
	}
	


	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}


	public void setRoles(Roles role) {
		this.role = role;
	}


	public RoleEnum getEnumRole() {
		return enumRole;
	}


	public void setEnumRole(RoleEnum enumRole) {
		this.enumRole = enumRole;
	}
    
    
}
