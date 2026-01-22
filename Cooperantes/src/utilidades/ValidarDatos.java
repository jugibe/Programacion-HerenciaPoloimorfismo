package utilidades;
/**
 * Clase con métodos
 * @author Ana
 * @version 1.0 12/01/26
 */
public class ValidarDatos {
	/**
	 * 
	 * @param dni
	 * @return
	 */
	public static boolean validarDni(String dni) {
		String letras ="TRWAGMYFPDXBNJZSQVHLCKE";
		int numeroDni;
		boolean longitudCorrecta, letraCorrecta=false;
		longitudCorrecta=dni.matches("[0-9]{8}[A-Z]");
		if(longitudCorrecta) {
			numeroDni=Integer.parseInt(dni.substring(0,8));
			letraCorrecta=dni.charAt(8)==(letras.charAt(numeroDni%23));
		}
		return longitudCorrecta&&letraCorrecta;
	}
}
