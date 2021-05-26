package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("alura");
		lista.add(empresa);
		Usuario u1 = new Usuario();
		u1.setLogin("nico");
		u1.setSenha("123");
		listaUsuarios.add(u1);
		
	}
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		lista.add(empresa);		
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		
	}

	public Empresa mostraEmpresaId(Integer id) {

		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}			
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		
		for (Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
}
