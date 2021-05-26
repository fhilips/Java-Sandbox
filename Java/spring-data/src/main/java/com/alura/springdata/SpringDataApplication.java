package com.alura.springdata;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alura.springdata.service.CrudCargoService;
import com.alura.springdata.service.CrudFuncionarioService;
import com.alura.springdata.service.CrudUnidadeTrabalhoService;
import com.alura.springdata.service.RelatorioFuncionarioDinamico;
import com.alura.springdata.service.RelatoriosServices;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{

	private final CrudCargoService cargoService;
	
	private final CrudFuncionarioService funcionarioService;

	private final CrudUnidadeTrabalhoService unidadeTrabalhoService;
	
	private final RelatoriosServices relatoriosServices;
	
	private final RelatorioFuncionarioDinamico relatorioFuncionarioDinamico;
	private boolean system = true;
	
	public SpringDataApplication(CrudCargoService cargoService,
			CrudFuncionarioService funcionarioService, 
			CrudUnidadeTrabalhoService unidadeTrabalhoService,
			RelatoriosServices relatoriosServices,
			RelatorioFuncionarioDinamico relatorioFuncionarioDinamico) {
		
		this.cargoService = cargoService;
		this.funcionarioService = funcionarioService;
		this.unidadeTrabalhoService = unidadeTrabalhoService;
		this.relatoriosServices = relatoriosServices;
		this.relatorioFuncionarioDinamico = relatorioFuncionarioDinamico;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		while(system) {
			System.out.println("Qual função deseja executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Cargo");
			System.out.println("2 - Funcionario");
			System.out.println("3 - Unidade");	
			System.out.println("4 - Relatorios");	
			System.out.println("5 - Relatorio dinamico");	
			Integer function = scanner.nextInt();

			switch (function) {
				case 1:
					cargoService.inicial(scanner);
					break;
				case 2:
					funcionarioService.inicial(scanner);
					break;
				case 3:
					unidadeTrabalhoService.inicial(scanner);
					break;
				case 4:
					relatoriosServices.inicial(scanner);
					break;
				case 5:
					relatorioFuncionarioDinamico.inicial(scanner);
					break;
				default:
					System.out.println("Finalizando");
					system = false;
					break;
			}
		}
	}

}
