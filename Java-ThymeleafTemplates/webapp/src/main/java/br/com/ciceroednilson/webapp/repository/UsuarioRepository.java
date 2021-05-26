package br.com.ciceroednilson.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ciceroednilson.webapp.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	UsuarioEntity findByLogin(String login);
	
}
