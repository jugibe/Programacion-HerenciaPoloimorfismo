package package1;

public class SubClase2 {
public int suplemento;
	
	public Subclase2(String nombre, int edad, String dirección, double sueldo, int suplemento) {
		super(nombre, edad, dirección, sueldo);
		this.suplemento=suplemento;
	}
	
	/**
	 * Metodo para probar el acceso a los atributos de la clase padre.
	 * 
	 */
	@Override
	public String metodoPrueba() {
		return "Nombre:" + nombre +" dirección:"+ dirección + " edad: "+ edad + " sueldo:"+ sueldo ;
		
	}

}
