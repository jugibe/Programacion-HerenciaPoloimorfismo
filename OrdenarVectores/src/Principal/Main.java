package Principal;
/*
 * Clase Principal para eplicar el ordenamiento de vectores
 * Válido cuando veamos listas
 */
import java.util.Arrays;
import java.util.Comparator;

import clases.Persona;

public class Main {

	public static void main (String[] args) {
		//Cfeo un array de Personas y lo lleno con datos inventados
		Persona[] listaPersonas=new Persona[5];
		llenarArroay(listaPersonas);
		
		//Al implmentar Comparable en Personas puedo comprobar el valor que devuelve el metodo compareTo
		System.out.println(listaPersonas[0].compareTo(listaPersonas[3]));
		//ordena de forna natural segun el conpareTo
		Arrays.sort(listaPersonas);
		imprimirArray(listaPersonas);
	
		
		System.out.println("#################");
		
		//Le paso el metodo de ordenacion con una funcion lambda
		Arrays.sort(listaPersonas, (p1,p2)->p1.getEdad().compareTo(p2.getEdad()));
		imprimirArray(listaPersonas);
		
		//
		System.out.println("#################");
		Arrays.sort(listaPersonas, (p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
		imprimirArray(listaPersonas);
		
		
		//Le paso el metodo de ordenacion con una clase anónima
		
		System.out.println("#################");
		Arrays.sort(listaPersonas, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return ((Persona)o1).getAltura().compareTo(((Persona)o2).getAltura());
				
			}});
		

	}

	private static void imprimirArray(Persona[] listaPersonas) {
		for(Persona p: listaPersonas) {
			System.out.println(p);
		}
		
	}

	private static void llenarArroay(Persona[] listaPersonas) {
		listaPersonas[0]=new Persona("juan",22,1.72);
		listaPersonas[1]=new Persona("Ana",16,1.71);
		listaPersonas[2]=new Persona("Alicia",44,1.55);
		listaPersonas[3]=new Persona("Miguel",33,1.82);
		listaPersonas[4]=new Persona("Alba",18,1.55);
		
		
	}

}
