package package1;

/**
 * Superclase para probar los diferenrtes modificadores de la clase, los métodos y los atributos.
 * 
 */
public class SuperClase1 {
	private String nombre;
	public int edad;
	String dirección;
	protected double sueldo;
	public SuperClase1(String nombre, int edad, String dirección, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dirección = dirección;
		this.sueldo = sueldo;
	}
	public String metodoPrueba() {
		return "Nombre:" + nombre +" dirección:"+ dirección + " edad: "+ edad + " sueldo:"+ sueldo ;		
	}
	
}
