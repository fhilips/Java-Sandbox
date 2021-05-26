package com.example.AuthExemple.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.AuthExemple.model.Gato;
import com.example.AuthExemple.model.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

	Optional<List<Telefone>> findAllByUsuarioId(long id);
	

}
