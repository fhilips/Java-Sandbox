package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemploCurso {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.forEach(c -> System.out.println(c.getNome()));
		// imprimindo nomes dos cursos com o numero de alunos maiores do q 100
		cursos.stream()
			.filter(c -> c.getAlunos() > 50 )
			.forEach(c -> System.out.println(c.getNome()));
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() > 100 )
//			.map(c -> c.getAlunos())
//			.forEach(total -> System.out.println(total));
		
		cursos.stream()
			.filter(c -> c.getAlunos() > 100 )
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		
		int sum = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos).sum();
	
		System.out.println(sum);
		
		Optional<Curso> optionalCursos = cursos.stream().filter(c -> c.getAlunos() >= 100 ).findAny();
		
		// fazem a mesma coisa utilizando o Opticional
		Curso curso = optionalCursos.orElse(null);
		optionalCursos.ifPresent(c -> System.out.println(c.getNome()));
		if(optionalCursos.isPresent()) {
			Curso c1 = optionalCursos.get();
			System.out.println(c1.getNome());
		}
		System.out.println(curso.getNome());
		
		// stream para coleções
		
		List<Curso> resultado = cursos.stream()
									.filter(c -> c.getAlunos() >= 100 )
									.collect(Collectors.toList());
		
		Map<String, Integer> map = cursos.stream()
									.filter(c -> c.getAlunos() >= 100 )
									.collect(Collectors
											.toMap(c -> c.getNome(),
												   c -> c.getAlunos()));
		System.out.println(map);
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100 )
		.collect(Collectors
				.toMap(c -> c.getNome(),
					   c -> c.getAlunos()))
		        .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
	
		cursos.stream().mapToInt(c -> c.getAlunos()).average();
	
		List<Curso> collect = cursos.stream()
		   .filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
	} 

}
