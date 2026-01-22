package clases;

public class BuscarMaximo implements Operacion{

	@Override
	public int ejecutar(int[] datos) {
		int max=datos[0];
		for(int i:datos) {
			max=(i>max)?i:max;
		}
		return max;
	}

}
