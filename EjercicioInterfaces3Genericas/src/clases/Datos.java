package clases;

public class Datos <T> {
	Operacion <T> o;
	private T[] datos;
	public Datos(T[] datos) {
		this.datos = datos;
	}
	
	public void mostrarInforme() {
		System.out.println(o.ejecutar(datos));
		
	}

	public Operacion<T> getO() {
		return o;
	}

	public void setO(Operacion<T> o) {
		this.o = o;
	}

	public T[] getDatos() {
		return datos;
	}

	public void setDatos(T[] datos) {
		this.datos = datos;
	}
	

}
