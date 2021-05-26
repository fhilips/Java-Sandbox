package br.com.alura.loja;


import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 6);
		
		
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

		System.out.println(calculadora.calcular(orcamento));
		System.out.println(calculadora.calcular(orcamento2));
		
	}
}
