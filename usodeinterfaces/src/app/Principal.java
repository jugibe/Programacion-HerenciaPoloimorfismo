package app;

import clases.Saludo;
import clases.SaludoFormal;

public class Principal {

	public static void main(String[] args) {
		//Usando clases
		SaludoFormal sf=new SaludoFormal();
		sf.saludar("juanjo");
		
		//con lambdas
		Saludo saludo = nombre -> System.out.println("Hola, " + nombre + "!");
		saludo.saludar("juan");
		
		//Clase anomnima
		Saludo saludo2 = new Saludo() {

			@Override
			public void saludar(String s) {
				System.out.println("jope "+ s);
				
			}
		};
		saludo2.saludar("pepe");


		
	}

}
