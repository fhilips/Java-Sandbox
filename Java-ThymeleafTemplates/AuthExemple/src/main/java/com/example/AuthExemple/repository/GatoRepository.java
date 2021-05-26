package com.example.AuthExemple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AuthExemple.model.Gato;

public interface GatoRepository extends JpaRepository<Gato, Long> {

}
