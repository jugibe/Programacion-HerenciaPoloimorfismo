package app;

import clases.Datos;

public class Main {

	public static void main(String[] args) {
		Datos <String> d=new Datos(new String [] {"casaee","grande"});
		d.setO((v)->metodo(d.getDatos()));
		d.mostrarInforme();

	}

	//vamos a hacer que devuelva el numero total de caracteres
	private static int metodo(String[] datos) {
		int resultado=0;
		for(String s:datos) {
			resultado+=s.length();
		}
		return resultado;
	}

}
