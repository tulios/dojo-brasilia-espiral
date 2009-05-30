package br.espiral;


public class Matriz {

	private double[][] matriz;
	
	public Matriz(String valores, int qtdLinhas, int qtdColuna) {
		this.matriz = new double[qtdLinhas][qtdColuna];
		String[] linhas = valores.split("\n");
		
		for (int x = 0; x< linhas.length; x++){
			String[] colunas = linhas[x].split(",");
			for (int y = 0; y < colunas.length; y++) {
				matriz[x][y] = Double.parseDouble(colunas[y].trim()); 
			}
		}
	}

	public double get(int x, int y) {
		return matriz[x][y];
	}

	public int getX() {
		return matriz.length;
	}

	public int getY() {
		return matriz[0].length;
	}
	
}
