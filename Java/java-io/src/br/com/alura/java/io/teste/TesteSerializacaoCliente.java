package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		
//		Cliente cliente = new Cliente();
//		cliente.setNome("jon calo");
//		cliente.setCpf("58474587");
//		cliente.setProfissao("carnivoro");
//	
//
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cliente.bin"));  // tranformar um obj em binario
//		oos.writeObject(cliente);		// gravar objecto
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cliente.bin"));		// 	transformar binario em obj
		Cliente cliente = (Cliente) ois.readObject();	// obj string recebe a leitura do binario, necessario um cast para string pois o retorno pe generico
		
		ois.close();
		System.out.println(cliente.getNome());
}

}