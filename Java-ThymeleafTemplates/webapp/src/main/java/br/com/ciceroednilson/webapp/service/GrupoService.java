package br.com.ciceroednilson.webapp.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ciceroednilson.webapp.entity.GrupoEntity;
import br.com.ciceroednilson.webapp.model.GrupoModel;
import br.com.ciceroednilson.webapp.repository.GrupoRepository;

@Service
@Transactional
public class GrupoService {

	@Autowired
	private GrupoRepository grupoRepository;
	
	/**CONSULA OS GRUPOS CADASTRADOS*/
	@Transactional(readOnly = true)
	public List<GrupoModel> consultarGrupos(){
		
		List<GrupoModel> gruposModel =  new ArrayList<GrupoModel>();
		
		/*CONSULTA TODOS OS GRUPOS*/
		List<GrupoEntity> gruposEntity = this.grupoRepository.findAll();
		

	    gruposEntity.forEach(grupo ->{ 
		   gruposModel.add(new GrupoModel(grupo.getCodigo(), grupo.getDescricao())); 
	    });
		
		return gruposModel;
	}
	
}
