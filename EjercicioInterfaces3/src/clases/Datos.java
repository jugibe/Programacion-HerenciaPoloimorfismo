package clases;

public class Datos {
	private Operacion o;
	private int [] datos;
	public Datos(int[] datos) {
		
		this.datos = datos;
	}
	
	public Operacion getO() {
		return o;
	}

	public void setO(Operacion o) {
		this.o = o;
	}

	public int[] getDatos() {
		return datos;
	}

	public void setDatos(int[] datos) {
		this.datos = datos;
	}

	public void mostrarInforme() {
		System.out.println(o.ejecutar(datos));
		
	}
	
}
