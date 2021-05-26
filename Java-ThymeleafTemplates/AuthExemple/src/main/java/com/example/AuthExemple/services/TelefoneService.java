package com.example.AuthExemple.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

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
public class TelefoneService {
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public void salvarTelefone(List<Telefone> tel) {
		telefoneRepository.saveAll(tel);		
	}

	public Optional<List<Telefone>> encontraTelefonePeloId(long id) {		
		return telefoneRepository.findAllByUsuarioId(id);
	}
		
	
	
}
