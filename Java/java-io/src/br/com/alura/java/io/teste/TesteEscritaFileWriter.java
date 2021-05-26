package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo
		//Fluxo de entrada com arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		// FileWriter fw = new FileWriter("lofghjrem3.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
		
		System.out.println("fgh");
		bw.write("Lorem ipsum dolor sit amet, consectetur ad5ipiscing elit, sed do eiusmod");
		
		//fw.write(System.lineSeparator());	
		//fw.write("\n");
		bw.newLine();
		bw.write("\r\n");
		bw.write("q cachorro oq mal");
		bw.close();
	
	}

}
