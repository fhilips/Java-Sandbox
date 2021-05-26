package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteProperties {			// classe de propriedades do projeto exemplo

	public static void main(String[] args) throws IOException {
		Properties props = new Properties(); 
		props.setProperty("login", "alura"); //chave, valor
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");

		props.store(new FileWriter("conf.properties"), "algum comentário");
		
		Properties propsReader = new Properties();        
		propsReader.load(new FileReader("conf.properties"));

		String login = propsReader.getProperty("login");
		String senha = propsReader.getProperty("senha");
		String endereco = propsReader.getProperty("endereco");

		System.out.println(login + ", " + senha  + ", " +  endereco);
	}

}
