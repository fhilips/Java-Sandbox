package com.alura.springdata.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.alura.springdata.model.Cargo;
import com.alura.springdata.repository.CargoRepository;

@Service
public class CrudCargoService {
	
	private final CargoRepository cargoRepository;
	private boolean system = true;

	public CrudCargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}
	
	public void inicial(Scanner scanner) {
		while(system) {
			System.out.println("qual acao deseja executar");
			System.out.println("0 sair");
			System.out.println("1 salvar");
			System.out.println("2 atualizar");
			System.out.println("3 visualizar");
			System.out.println("4 deletar");
			
			int action = scanner.nextInt();
			
			switch (action) {
			case 1:
				salvar(scanner);
				break;
			case 2:
				atualizar(scanner);				
				break;
			case 3:
				visualizar();
				
				break;
			case 4:
				deletar(scanner);
				break;
			default:
				system = false;
				break;
			}
		}
		
	}
	
	
	private void salvar(Scanner scanner) {
		System.out.println("Desc do cargo");
		String descricao = scanner.next();
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);
		cargoRepository.save(cargo);
		System.out.println("Salvo");
		
	}

	public void atualizar(Scanner scanner) {
		System.out.println("Id:");
		Integer id = scanner.nextInt();
		System.out.println("desc");
		String descricao = scanner.next();
		Cargo cargo = new Cargo();
		cargo.setId(id);
		cargo.setDescricao(descricao);
		cargoRepository.save(cargo);
		System.out.println("salvo");
		
	}

	public void visualizar() {
		Iterable<Cargo> cargos = cargoRepository.findAll();
		cargos.forEach(cargo -> System.out.println(cargo));
	}
	
	public void deletar(Scanner scanner) {
		System.out.println("Id");
		Integer id = scanner.nextInt();
		cargoRepository.deleteById(id);
		System.out.println("deletado");
	}
}
