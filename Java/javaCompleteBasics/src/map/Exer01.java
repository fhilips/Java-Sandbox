package map;

import java.util.*;
import java.util.Map.Entry;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class Exer01 {
    public static void main(String[] args) {
        System.out.println("Crie um dicion�rio que relacione os estados e suas respectivas popula��es: ");
        Map<String, Integer> populacaoEstadosNe = new HashMap<String, Integer>();
        populacaoEstadosNe.put("PE", 9616621);
        populacaoEstadosNe.put("AL", 3351543);
        populacaoEstadosNe.put("CE", 9187103);
        populacaoEstadosNe.put("RN", 3534265);
       
        System.out.println(populacaoEstadosNe);
        System.out.println("Substitua a popula��o do estado RN por : 3.534.165");
        
        populacaoEstadosNe.put("PE", 3534165);
        System.out.println(populacaoEstadosNe);


        System.out.println("Confira se o estado da Para�ba (PB) tucson est�o no dicion�rio, caso n�o, adicione " +
                "PB - 4.039.277: ");
        
        populacaoEstadosNe.put("PB", 4039277);        
        System.out.println(populacaoEstadosNe);

        System.out.println("Exiba a populac�o do estado PE: " + populacaoEstadosNe.get("PE"));

        System.out.println("Exiba todos os estados e suas popula��o na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadosNe2 = new LinkedHashMap<String, Integer>();
        populacaoEstadosNe2.put("PE", 9616621);
        populacaoEstadosNe2.put("AL", 3351543);
        populacaoEstadosNe2.put("CE", 9187103);
        populacaoEstadosNe2.put("RN", 3534265);
        System.out.println(populacaoEstadosNe2);
        
        System.out.println("Exiba todos os estados e suas popula��es na ordem alfab�tica: ");        
        
        Map<String, Integer> populacaoEstadosNe3 = new TreeMap<>();
        
        populacaoEstadosNe3.put("PE", 9616621);
        populacaoEstadosNe3.put("AL", 3351543);
        populacaoEstadosNe3.put("CE", 9187103);
        populacaoEstadosNe3.put("RN", 3534265);
        
        System.out.println(populacaoEstadosNe3);
        
        System.out.println("Exiba a soma da popula��o desses estados: ");
        int soma = 0;

        for (Entry<String, Integer> pop : populacaoEstadosNe.entrySet()) {
			soma += pop.getValue();			
		}
        System.out.println(soma);
        
        Collection<Integer> populacao = populacaoEstadosNe.values();
        String estadoMenorPopulacao = "";
        String estadoMaiorPopulacao = "";
        
        for(Entry<String, Integer> pop : populacaoEstadosNe.entrySet()) {
        	if(pop.getValue().equals(Collections.max(populacao))){
        		estadoMaiorPopulacao = pop.getKey();
        	}
        	if(pop.getValue().equals(Collections.min(populacao))){
        		estadoMenorPopulacao = pop.getKey();
        	}
        }      
             
        System.out.printf("Exiba o estado com o menor popula��o e seu respectivo valor\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior popula��o (%s) e seu respectivo valor\n",
                estadoMaiorPopulacao, Collections.max(populacao));
        System.out.println("Exiba a m�dia da popula��o deste dicion�rio de estados: " + (soma / populacaoEstadosNe.size()));
        System.out.println("Remova os estados com a popula��o menor que 4.000.000: ");
        
       

//        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
//        
//
//        System.out.println("Confira se a lista está vazia: " + populacaoEstadosNe.isEmpty());

    }
}
