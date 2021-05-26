package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate olimpiadas = LocalDate.of(2022, Month.JUNE, 5);
		
		int anos = hoje.getYear() - olimpiadas.getYear(); 
		
		System.out.println(anos);
		
		Period periodo =  Period.between(hoje, olimpiadas);
		
		System.out.println(periodo);
		
		LocalDate proxOlimpiadas = olimpiadas.plusYears(4);
		System.out.println(proxOlimpiadas);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proxOlimpiadas.format(formatter);
		System.out.println(valorFormatado);
		
		DateTimeFormatter formatterComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatterComHoras));
		
		LocalTime intervalo = LocalTime.of(12, 30);
		
		LocalDate data = LocalDate.of(2099, 01, 25);
		System.out.println(data);
		
		Period period = Period.between(LocalDate.now(), data);
		System.out.println(period.getMonths());
	}
}
