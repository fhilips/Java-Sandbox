package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Gato;



public interface GatoRepository extends JpaRepository<Gato, Long> {

}
