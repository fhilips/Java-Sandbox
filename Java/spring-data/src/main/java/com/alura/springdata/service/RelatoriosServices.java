package com.alura.springdata.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


import org.springframework.stereotype.Service;

import com.alura.springdata.model.Funcionario;
import com.alura.springdata.model.FuncionarioProjecao;
import com.alura.springdata.repository.FuncionarioRepository;

@Service
public class RelatoriosServices {

	private Boolean system = true;
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private final FuncionarioRepository funcionarioRepository;
	
	public RelatoriosServices(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public void inicial(Scanner scanner) {
		while(system) {
			System.out.println("Qual acao de cargo deseja executar");
			System.out.println("0 - Sair");
			System.out.println("1 - Buscar funcionario pelo nome");
			System.out.println("2 - Buscar funcionario pelo nome, data contratacao e salario maior");
			System.out.println("3 - Buscar data contratacao");
			System.out.println("4 - Pesquisa funcionario salario");
						
			int action = scanner.nextInt();
			
			switch (action) {
			case 1:
				buscaFuncionarioNome(scanner);
				break;
			case 2:
				findNomeSalarioMaiorDataContratacao(scanner);
				break;
			case 3:
				buscarFuncionarioDataContratacao(scanner);
				break;
			case 4:
				pesquisaFuncionarioSalario();
				break;
				
			default:
				system = false;
				break;
			}			
		}				
	}
	
	private void buscaFuncionarioNome(Scanner scanner) {
		System.out.println("Qual nome deseja pesquisar");
		String nome = scanner.next();
		List<Funcionario> listFuncionario = funcionarioRepository.findByNome(nome);
		listFuncionario.forEach(System.out::println);
		
	}
	private void findNomeSalarioMaiorDataContratacao(Scanner scanner) {
		System.out.println("Qual nome deseja pesquisar");
		String nome = scanner.next();
		
		System.out.println("Qual a data da contratacao");
		String data = scanner.next();
		LocalDate localDate = LocalDate.parse(data, formatter);
		
		System.out.println("Qual salario");
		Double salario = scanner.nextDouble();
		
		List<Funcionario> listFuncionario = funcionarioRepository
				.findNomeSalarioMaiorDataContratacao(nome, salario, localDate);
		listFuncionario.forEach(System.out::println);
	}
	
	private void buscarFuncionarioDataContratacao(Scanner scanner) {
		System.out.println("Qual a data da contratacao");
		String data = scanner.next();
		LocalDate localDate = LocalDate.parse(data, formatter);
		
		List<Funcionario> listFuncionario = funcionarioRepository.findDataContratacaoMaior(localDate);
		listFuncionario.forEach(System.out::println);
	}
	private void pesquisaFuncionarioSalario() {
		List<FuncionarioProjecao> list = funcionarioRepository.findFuncionarioSalario();
		list.forEach(f -> System.out.println("Funcionario: id: " + f.getId() 
		+ "| nome: " + f.getNome() + " |salario: " + f.getSalario()));
	}
}
