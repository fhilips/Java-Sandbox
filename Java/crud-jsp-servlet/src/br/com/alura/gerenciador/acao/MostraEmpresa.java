package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao{


	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("tt");
		String paramId = request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		Banco banco = new Banco();
		Empresa empresa = banco.mostraEmpresaId(id);
		
		request.setAttribute("empresa", empresa);
		System.out.println("tt");
		
		return "forward:FormAlteraEmpresa.jsp";
	}
}
