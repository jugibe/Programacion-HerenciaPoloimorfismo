package Clases;
/**
 * Clase Asalariado, subclase que hereda de Cooperante
 * @author Ana
 * @version 1.0 12/01/26
 * */
public class Asalariado extends Cooperante {
	/**
	 * sueldo del Asalariado
	 */
	private Double sueldo;

	/**
	 * Constructor de Asalariado
	 * @param nombre
	 * @param dni
	 * @param pais
	 * @param sueldo
	 */
	public Asalariado(String nombre, String dni, String pais, double sueldo) {
		super(nombre, dni, pais);
		this.sueldo = sueldo;
	}

	/**
	 * @return the sueldo
	 */
	public Double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/** 
	 * @return Devuelve los datos del asalariado en una línea
	 */
	@Override
	public String muestraDatos() {
		return "Nombre: "+nombre+". DNI: "+dni+". Pais: "+pais+". Sueldo: "+sueldo;
	}
}
