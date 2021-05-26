package com.alura.springdata.repository;


import org.springframework.stereotype.Repository;

import com.alura.springdata.model.Cargo;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer> {

}
