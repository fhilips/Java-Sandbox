package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ex1 {

	public static void main(String[] args) {		
		
		Set<String> coresArcoIris = new HashSet<>();
		
		coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        
        for (String cor : coresArcoIris) {
			System.out.println(cor);
		}
        
        System.out.println(coresArcoIris.size());
        Set<String> coresArcoIrisOrdenada = new TreeSet<>();
        coresArcoIrisOrdenada.addAll(coresArcoIris);
        System.out.println(coresArcoIrisOrdenada);

	}

}
