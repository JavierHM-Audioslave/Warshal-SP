package main;

public class MatrizDeExistencias {
	
	private Boolean[][] matrizDeExistencia;
	
	public MatrizDeExistencias(Grafo grafo)
	{
		matrizDeExistencia = new Boolean[grafo.obtenerLargoDegrafo()][grafo.obtenerLargoDegrafo()];
		int valorAux;		
		for(int i = 0; i<grafo.obtenerLargoDegrafo(); i++)
		{
			for(int j = 0; j<grafo.obtenerLargoDegrafo(); j++)
			{
				valorAux = grafo.obtenerValor(i, j);
				if(valorAux!=0 && valorAux!=1000000)
				{
					matrizDeExistencia[i][j] = true;
				}
				else
				{
					matrizDeExistencia[i][j] = false;
				}
			}
		}
	}
	
	public Integer obtenerLargoDeColumnasDeMatriz()
	{
		return matrizDeExistencia.length;
	}
	
	public Boolean obtenerValorDeCelda(Integer fila, Integer columna)
	{
		return matrizDeExistencia[fila][columna];
	}
	
	public void setValorDeCelda(Integer fila, Integer columna, Boolean valor)
	{
		matrizDeExistencia[fila][columna] = valor;
	}
	
	public Boolean[][] getMatrizDeExistencia()
	{
		return matrizDeExistencia;
	}

}
