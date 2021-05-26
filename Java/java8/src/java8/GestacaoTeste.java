package java8;

import java.time.Instant;
import java.time.LocalDate;

public class GestacaoTeste {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate dataProvavelParto = LocalDate.now();
		LocalDate dataOutr = LocalDate.now();
		LocalDate data = LocalDate.of(dataOutr.getYear(), dataOutr.getMonth(), dataOutr.getDayOfMonth());
		
		System.out.println("fsd " + data);
		int semanaAtual = 18;
		int diasDaSemanAtual = 3;
		
		LocalDate pro = hoje.plusWeeks(411-semanaAtual).minusDays(diasDaSemanAtual);
//		
//		Period periodo = Period.between(hoje, pro);
//		
//		System.out.println(periodo);
//		System.out.println(hoje);
//		System.out.println(pro);
//		
//		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
//		  String date = "16/08/2016";
//
//		  
//		  LocalDateTime localDate = LocalDateTime.parse(date, formatter);	
//		System.out.println(date);
//		
//		LocalDate dataUltimaMentuacao = LocalDate.now();
//		dataProvavelParto = dataUltimaMentuacao .plusWeeks(40);
//		System.out.println(dataProvavelParto);
	}
}
