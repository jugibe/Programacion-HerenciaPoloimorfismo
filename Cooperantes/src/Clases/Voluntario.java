package Clases;
/**
 * Clase Voluntario, subclase que hereda de Cooperante
 * @author Ana
 * @version 1.0 12/01/26
 * */
public class Voluntario extends Cooperante {
	private String ong;

	/**
	 * Constructor de Voluntario
	 * @param nombre
	 * @param dni
	 * @param pais
	 * @param ong
	 */
	public Voluntario(String nombre, String dni, String pais, String ong) {
		super(nombre, dni, pais);
		this.ong = ong;
	}
	
	/** 
	 * @return Devuelve los datos del voluntario en una línea
	 */
	@Override
	public String muestraDatos() {
		return "Nombre: "+nombre+". DNI: "+dni+". Pais: "+pais+". ONG: "+ong;
	}
	
}
