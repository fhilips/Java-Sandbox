package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);	// (fis, "ITF-8") - encoding do mac
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
	}

}
