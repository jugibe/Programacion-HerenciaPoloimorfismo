package app;

import clases.*;

public class Principal {

	public static void main(String[] args) {
		int[] numeros= {3,4,5,6};
		
		mostrarInforme(numeros,new Sumador());
		mostrarInforme(numeros,new BuscarMaximo());
		
		

	}

	private static void mostrarInforme(int[] numeros, Operacion s) {
		System.out.println(s.ejecutar(numeros));
		
	}

}
