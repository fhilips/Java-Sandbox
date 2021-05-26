package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
//		String nome = "Filipe Santos";
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));  // tranformar um obj em binario
//		oos.writeObject(nome);		// gravar objecto
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cliente.bin"));		// 	transformar binario em obj
		String nome = (String) ois.readObject();	// obj string recebe a leitura do binario, necessario um cast para string pois o retorno pe generico
		ois.close();
		System.out.println(nome);
}

}