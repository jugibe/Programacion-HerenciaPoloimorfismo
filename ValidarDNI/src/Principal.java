
public class Principal {

	public static void main(String[] args) {
		System.out.println(validarDNI("0000000RR"));

	}

	private static boolean validarDNI(String dni) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		boolean letrasNumero=dni.matches("[0-9]{8}[A-Z]");
		if (!letrasNumero)return false;
		int numeroDNI=Integer.parseInt(dni.substring(0, dni.length()-1));
		boolean digitoControl= (dni.charAt(8)==letras.charAt(numeroDNI%23));
		return letrasNumero&&digitoControl;
		
	}

}
