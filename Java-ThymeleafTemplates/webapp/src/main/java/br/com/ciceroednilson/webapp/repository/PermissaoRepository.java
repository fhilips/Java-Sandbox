package br.com.ciceroednilson.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ciceroednilson.webapp.entity.GrupoEntity;
import br.com.ciceroednilson.webapp.entity.PermissaoEntity;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {

	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);
}
