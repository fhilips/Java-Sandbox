package com.example.AuthExemple.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.NotFound;

import com.example.AuthExemple.model.Roles;
import com.example.AuthExemple.model.User;
import com.sun.istack.NotNull;

public class CadastroNovoUser {
   
    private long id;
    
    private String username;
    
    private String password;

    private int active;

    private String roles;

    private String permissions = "";

    public CadastroNovoUser(String username, String password, String roles, String permissions){
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.permissions = permissions;
        this.active = 1;
    }

    public CadastroNovoUser(){}

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

//    public List<String> getRoles() {
//        return roles;
//    }

    public String getPermissions() {
        return permissions;
    }

//    public List<Roles> getRoleList(){
//        return getRoles();
//    }

    public List<String> getPermissionList(){
        if(this.permissions.length() > 0){
            return Arrays.asList(this.permissions.split(","));
        }
        return new ArrayList<>();
    }
//    public User toUser() {
//    	User user = new User(this.username,
//    						this.password,
//    						this.roles,
//    						this.permissions);  
//    	
//    	return user;
//    }

	
}
