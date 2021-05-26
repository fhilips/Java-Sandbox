package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada/saida de com arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("q cachorro oq");
		
		
//		String line = bw.readLine();
//		
//		while(line != null) {
//			System.out.println(line);
//			line = br.readLine();
//		}
		
		bw.close();
	}

}
