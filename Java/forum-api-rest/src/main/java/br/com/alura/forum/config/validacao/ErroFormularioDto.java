package br.com.alura.forum.config.validacao;

public class ErroFormularioDto {

	private String erro;
	private String campo;
	
	
	
	public ErroFormularioDto(String erro, String campo) {
		
		this.erro = erro;
		this.campo = campo;
	}
	public String getErro() {
		return erro;
	}
	public String getCampo() {
		return campo;
	}
	
	
}
