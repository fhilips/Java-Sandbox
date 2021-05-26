package com.example.AuthExemple.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.AuthExemple.model.Gato;
import com.example.AuthExemple.model.Roles;
import com.example.AuthExemple.model.Telefone;

public interface RolesRepository extends JpaRepository<Roles, Long> {
	

}
