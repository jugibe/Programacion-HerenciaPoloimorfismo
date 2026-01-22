package app;

import java.util.Arrays;
import java.util.Scanner;

import Clases.*;
import utilidades.ValidarDatos;


/**
 * Clase Principal, gestión ong
 * @author Ana
 * @version 1.0 12/01/26
 * */
public class Principal {
	public static Scanner teclado= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/**
		 * Declarar un array de Cooperante
		 */
		Cooperante coops[]=new Cooperante[8];
		//LLenar array de Cooperante
		llenarArray(coops);
		
		
		int opcion=0;
		do {
			//Imprime el menú
			System.out.println("Elige una opción: \n1. Alta asalariado\n2. Alta voluntario\n3.Lista cooperantes"
					+ "\n"
					+ "4. Lista asalariados por nombre.0\n"
					+ "5. Lista asalariados por sueldo \n6. Lista Voluntarios\n0. Salir");
			//Pedir opcion
			opcion=teclado.nextInt();
			teclado.nextLine();
			//Ejecutar accion según la opción elegida
			switch(opcion) {
			case 1:
				Asalariado a= altaAsalariado(coops);
				if(a!=null) {
					coops=Arrays.copyOf(coops, coops.length+1);
					coops[coops.length-1]=a;
				}
				break;
			case 2:
				Voluntario v=altaVoluntario(coops);
				if(v!=null) {
					coops=Arrays.copyOf(coops, coops.length+1);
					coops[coops.length-1]=v;
				}
				break;
			case 3:
				Arrays.sort(coops, (c1,c2)-> (c1.getDni()).compareTo(c2.getDni()));
				listarCooperantes(coops);
				break;
			case 4:
				//Por nombre
				listarAsalariadosPorNombre(coops);
				break;
			case 5:
				//Por sueldo
				listarAsalariadosPorSueldo(coops);
				break;
			case 6:
				listarVoluntarios(coops);
				break;
			case 0:
				System.out.println("Fin de programa");
				break;
			default:
				System.out.println("Opción erronea");	
			}
		} while(opcion!=0);
	}
	
	/**
	 * Método que imprime los voluntarios
	 * @param coops
	 */
	private static void listarVoluntarios(Cooperante[] coops) {
		for(Cooperante c:coops) {
			if(c instanceof Voluntario) {
				System.out.println(c.muestraDatos()); 
			}
		}
		
	}

	/**
	 * Método que imprime los asalariados ordenados por nombre
	 * @param coops
	 */
	private static void listarAsalariadosPorNombre(Cooperante[] coops) {
		Arrays.sort(coops,(c1,c2)->-(c1.getNombre()).compareTo(c2.getNombre()));
		for(Cooperante c:coops) {
			if(c instanceof Asalariado) {
				System.out.println(c.muestraDatos()); 
			}
		}
		
	}
	
	/**
	 * Método que imprime los asalariados ordenados por sueldo
	 * @param coops
	 */
	private static void listarAsalariadosPorSueldo(Cooperante[] coops) {
		//Construyo un array solo con los asalariados
		Asalariado asal[]=new Asalariado[0];
		
		for(Cooperante c:coops) {
			//Cada asalariado que encuentre lo añado al array
			if(c instanceof Asalariado) {
				asal=Arrays.copyOf(asal, asal.length+1);
				asal[asal.length-1]=(Asalariado)c;
			}
		}
		//Ahora se puede ordenar por sueldo
		Arrays.sort(asal,(a1,a2)->(a1.getSueldo()).compareTo(a2.getSueldo()));
		
		for(Asalariado a:asal) {
			System.out.println(a.muestraDatos()); 
		}
	}
	/**
	 * Método que imprime los cooperantes
	 * @param coops
	 */
	private static void listarCooperantes(Cooperante[] coops) {
		for(Cooperante c:coops) {
			System.out.println(c.muestraDatos());
		}
		
	}

	/**
	 * Método para rellenar el Array de Cooperante
	 * @param coops
	 */
	private static void llenarArray(Cooperante[] coops) {
		coops[0]=new Asalariado("A1","98347874N","España",2000);
		coops[1]=new Asalariado("A2","88933410T","España",2100);
		coops[2]=new Asalariado("A3","95175327Q","España",1000);
		coops[3]=new Asalariado("A4","46801340C","España",2200);
		coops[4]=new Asalariado("A5","18785645G","España",2050);
		coops[5]=new Voluntario ("V1","27717556A","España","UNICEF");
		coops[6]=new Voluntario ("V2","26872171Y","España","UNICEF");
		coops[7]=new Voluntario ("V3","66473555J","España","UNICEF");
	}
	
	public static Asalariado altaAsalariado(Cooperante[] coops) {
		Asalariado asal;
		String dni,nombre,pais;
		double salario;
		
		System.out.println("Dime el dni");
		dni=teclado.nextLine();
		if(!ValidarDatos.validarDni(dni)||estaEnLista(dni,coops)) {
			System.out.println("Error");
			return null;
		}
		System.out.println("Dime el nombre");
		nombre=teclado.nextLine();
		System.out.println("Dime el pais");
		pais=teclado.nextLine();
		System.out.println("Dime el salario");
		salario=teclado.nextDouble();
		
		asal=new Asalariado(nombre,dni,pais,salario);
		return asal;
	}
	
	public static Voluntario altaVoluntario(Cooperante[] coops) {
		Voluntario vol;
		String dni,nombre,pais,ong;
		
		System.out.println("Dime el dni");
		dni=teclado.nextLine();
		if(!ValidarDatos.validarDni(dni)||estaEnLista(dni,coops)) {
			System.out.println("Error");
			return null;
		}
		System.out.println("Dime el nombre");
		nombre=teclado.nextLine();
		System.out.println("Dime el pais");
		pais=teclado.nextLine();
		System.out.println("Dime la ong");
		ong=teclado.nextLine();
		
		vol=new Voluntario(nombre,dni,pais,ong);
		return vol;
	}

	private static boolean estaEnLista(String dni, Cooperante[] coops) {
		for(int i=0;i<coops.length;i++) {
			if(dni.equals(coops[i].getDni())) {
				return true;
			}
		}
		return false;
	}

	

}
