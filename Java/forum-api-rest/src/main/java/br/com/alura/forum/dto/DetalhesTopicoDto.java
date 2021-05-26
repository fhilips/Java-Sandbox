package br.com.alura.forum.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;

public class DetalhesTopicoDto {

	private Long id;
	private String mensagem;
	private String titulo;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private StatusTopico status;
	private List<RespostaDto> repostas;
	
	public DetalhesTopicoDto(Topico topico) {
		this.id = topico.getId();
		this.mensagem = topico.getMensagem();
		this.titulo = topico.getTitulo();
		this.dataCriacao = topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.repostas = new ArrayList<RespostaDto>();
		repostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public StatusTopico getStatus() {
		return status;
	}

	public List<RespostaDto> getRepostas() {
		return repostas;
	}	
	
		
	
	
	
}
