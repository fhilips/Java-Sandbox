package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		
		palavras.add("um");
		palavras.add("dois");
		palavras.add("tresl");
		
		ComparatorPorTamanho comparator = new ComparatorPorTamanho();
		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		palavras.sort(Comparator.comparing(s -> s.length() ));
		palavras.sort(Comparator.comparing(String::length));
		palavras.forEach(palavra -> System.out.println(palavra));
		palavras.forEach(System.out::println);

	}

}

class ComparatorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.length() < s2.length()) {
			return 1;
		}
		if(s1.length() > s2.length()) {
			return -1;
		}
		return 0;
	}
	
}