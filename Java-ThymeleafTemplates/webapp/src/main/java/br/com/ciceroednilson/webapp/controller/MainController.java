package br.com.ciceroednilson.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	/***
	 * ESSE MÉTODO CARREGA A PÁGINA(index.html) DE LOGIN DA NOSSA APLICAÇÃO
	 * @return
	 */
	@RequestMapping(value="/", method= RequestMethod.GET)	
	public String index(){	
		
	    return "index";
	}
	
	/***
	 * CARREGA À PÁGINA INICIAL DA APLICAÇÃO APÓS EFETUARMOS O LOGIN 
	 * @return
	 */
	@RequestMapping(value="/home", method= RequestMethod.GET)
	public String home(){
		
		return "home";
	}
	
	/***
	 * MOSTRA UM PÁGINA COM A MENSAGEM DE ACESSO NEGADO QUANDO O 
	 * USUÁRIO NÃO TIVER PERMISSÃO DE ACESSAR UMA DETERMINADA FUNÇÃO DO SISTEMA
	 * @return
	 */
	@RequestMapping(value="/acessoNegado", method= RequestMethod.GET)
	public String acessoNegado(){
		
		return "acessoNegado";
	}
	
}
