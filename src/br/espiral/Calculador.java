package br.espiral;

public class Calculador {

	public double calculaMatriz(Matriz matriz) {
		int qtdlinhas = matriz.getX();
		int qtdColunas = matriz.getY();
		
		double resultado = 0.0;
		while (qtdlinhas <= 0 ||qtdColunas <= 0) {
			
		}
		
		
		
		
		resultado = ((matriz.get(0,0)*matriz.get(0,1))/matriz.get(1,1))-matriz.get(1,0);
		
		return resultado;
	}

}
