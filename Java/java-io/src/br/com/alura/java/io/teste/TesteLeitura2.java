package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));	//(new File("contas.csv", "UTF-8") - enconding do mac
		
		while(scanner.hasNext()) {
				String linha = scanner.nextLine();
				System.out.println(linha);
				
				Scanner linhaScanner = new Scanner(linha);
				linhaScanner.useLocale(Locale.US);
				linhaScanner.useDelimiter(",");				// metodo do scanner para delimitar e separar informações 
				
				String tipoConta = linhaScanner.next();
				int numConta = linhaScanner.nextInt();
				int numAgen = linhaScanner.nextInt();
				String nome = linhaScanner.next();
				double saldo = linhaScanner.nextDouble();
				
					
				System.out.format(new Locale("pt", "BR"),
						"%s %d %d %s %05.3f %n", tipoConta, numConta, numAgen, nome, saldo);	// formatador de string da classe string/system
			
				
				
				linhaScanner.close();
				
//				String[] valores = linha.split(",");				// splita a partir de um condicional em uma array
//				System.out.println(Arrays.toString(valores));		// passa a array para string
				
		}
		


	
	
	
	}
}
