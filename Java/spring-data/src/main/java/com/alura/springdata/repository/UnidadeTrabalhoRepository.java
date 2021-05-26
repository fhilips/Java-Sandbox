package com.alura.springdata.repository;


import org.springframework.stereotype.Repository;

import com.alura.springdata.model.Cargo;
import com.alura.springdata.model.UnidadeTrabalho;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UnidadeTrabalhoRepository extends CrudRepository<UnidadeTrabalho, Integer> {

}
