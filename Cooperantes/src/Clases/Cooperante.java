package Clases;
/**
 * Clase Cooperante superclase
 * @author Ana
 * @version 1.0 12/01/26
 * */
public class Cooperante {
	/**
	 * nombre del cooperante
	 */
	protected final String nombre;
	/**
	 * dni del cooperante
	 */
	protected final String dni;
	/**
	 * pais del cooperante
	 */
	protected final String pais;
	
	/**
	 * constructor de Cooperante
	 * @param nombre
	 * @param dni
	 * @param pais
	 */
	public Cooperante(String nombre,String dni,String pais) {
		this.nombre=nombre;
		this.dni=dni;
		this.pais=pais;
	}
	
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/** 
	 * @return Devuelve los datos del cooperante en una línea
	 */
	public String muestraDatos() {
		return "Nombre: "+nombre+". DNI: "+dni+". Pais: "+pais;
	}
}
