package com.example.AuthExemple.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.AuthExemple.model.Roles;
import com.example.AuthExemple.model.Telefone;
import com.example.AuthExemple.model.User;
import com.example.AuthExemple.repository.RolesRepository;
import com.example.AuthExemple.repository.TelefoneRepository;
import com.example.AuthExemple.repository.UserRepository;

@Service
public class RoleService {

	@Autowired
	private RolesRepository rolesRepository;


	public Roles encontraRolePeloId(long l) {
		System.out.println(l);
		return rolesRepository.findById(l).get();
	}


	public void salvarRole(Roles role) {
		rolesRepository.save(role);
	}

	
	
}
