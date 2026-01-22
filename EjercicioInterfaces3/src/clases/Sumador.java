package clases;

public class Sumador implements Operacion{

	@Override
	public int ejecutar(int[] datos) {
		int suma=0;
		for (int i: datos) {
			suma+=i;
		}
		return suma;
	}
	

}
