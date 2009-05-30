package br.espiral;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculador {
	
	@Test
	public void testCalculo1234(){
		String valores = "1,2\n" +
						 "3,4\n";
		Matriz matriz = new Matriz(valores,2,2);
		Calculador calc = new Calculador();
		
		double  resultado = calc.calculaMatriz(matriz);
		assertEquals(-2.5,resultado);
		
	}
	
	@Test
	public void testCalculo4321(){
		String valores = "4,3\n" +
						 "2,1\n";
		Matriz matriz = new Matriz(valores,2,2);
		Calculador calc = new Calculador();
		
		double  resultado = calc.calculaMatriz(matriz);
		assertEquals(10,resultado);
		
	}

}
