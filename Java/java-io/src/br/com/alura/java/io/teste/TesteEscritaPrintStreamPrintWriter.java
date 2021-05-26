package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");
		
		ps.println("\"Lorem ipsum dolor sit amet, consectetur ad5ipiscing elit, sed do eiusmod\"");
		
		ps.println();
		ps.println();
		ps.println("chaves noiahg");	

		ps.close();
	}

}
