package com.example.AuthExemple.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.AuthExemple.model.Roles;
import com.example.AuthExemple.model.Telefone;
import com.example.AuthExemple.model.User;
import com.example.AuthExemple.repository.RolesRepository;
import com.example.AuthExemple.repository.TelefoneRepository;
import com.example.AuthExemple.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User encontraUserPrincipal() {
		 String username = SecurityContextHolder.getContext().getAuthentication().getName();
		 return userRepository.findByUsername(username);
	}

	public void salvarUsuario(@Valid User novoUser) {
		 userRepository.save(novoUser);	
	}


	public User encontraPeloUsuarioId(long l) {
		// TODO Auto-generated method stub
		return userRepository.findById(l).get();
	}


	
	
}
