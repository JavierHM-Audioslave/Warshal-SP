package main;

public class Warshall {
	
	private MatrizDeExistencias matExistencias;
	
	public Warshall(Grafo grafo)
	{
		matExistencias = new MatrizDeExistencias(grafo);
	}
	
	public Boolean[][] resolver()
	{		
		Boolean primerTermino, segundoTermino, tercerTermino;
		
		for(int iteracionDeMatriz = 0; iteracionDeMatriz<matExistencias.obtenerLargoDeColumnasDeMatriz(); iteracionDeMatriz++)
		{
			for(int i = 0; i<matExistencias.obtenerLargoDeColumnasDeMatriz(); i++)
			{
				for(int j = 0; j<matExistencias.obtenerLargoDeColumnasDeMatriz(); j++)
				{
					if( i!=j && i!=iteracionDeMatriz && j!=iteracionDeMatriz && (matExistencias.obtenerValorDeCelda(i, j)==true || (matExistencias.obtenerValorDeCelda(i, iteracionDeMatriz)==true && matExistencias.obtenerValorDeCelda(iteracionDeMatriz, j)==true)) )
					{
						matExistencias.setValorDeCelda(i, j, true);
					}
				}
			}
		}
		
		return matExistencias.getMatrizDeExistencia();
	}
}
