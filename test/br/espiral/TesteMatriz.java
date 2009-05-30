package br.espiral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteMatriz {

	@Test
	public void testeMontaMatriz() {
		String valores = "1,2\n" +
		  				 "3,4\n";
		  				 
		Matriz matriz = new Matriz(valores, 2, 2);
		
		assertEquals(1,matriz.get(0,0));
		assertEquals(2,matriz.get(0,1));
		assertEquals(3,matriz.get(1,0));
		assertEquals(4,matriz.get(1,1));
	}
	
	@Test
	public void testeMontaMatriz2() {
		String valores = "1,2,3\n" +
		  				 "4,5,6\n";
		  				 
		Matriz matriz = new Matriz(valores, 2, 3);
		
		assertEquals(1,matriz.get(0,0));
		assertEquals(2,matriz.get(0,1));
		assertEquals(3,matriz.get(0,2));
		assertEquals(4,matriz.get(1,0));
		assertEquals(5,matriz.get(1,1));
		assertEquals(6,matriz.get(1,2));
	}
	
}
