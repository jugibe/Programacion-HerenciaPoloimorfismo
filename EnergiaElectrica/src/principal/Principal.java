package principal;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Empleado [] listaEmpleados=new Empleado[5];
		llenarLista(listaEmpleados);
		Scanner entrada=new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("-----OPCIONES-----");
			System.out.println("1.Modificar el sueldo base de todos los empleados");
			System.out.println("2. Modificar el plus de todos los jefes");
			System.out.println("3. Visualizar los datos de los empleados alfabeticamente");
			System.out.println("4.Visualizar los datos de los Jefes");
			System.out.println("5. Salir");
			
			System.out.println();
			System.out.println("Introduce una opcion");
			opcion=entrada.nextInt();
		
			switch(opcion) {
			case 1:
				System.out.println("Introduce le nuevo sueldo base de los Empleados: ");
				Empleado.setSueldoBase(entrada.nextDouble());
				break;
			case 2:
				double plusNuevo;
				System.out.println("Introduce el nuevo valor del plus para jefes: ");
				plusNuevo=entrada.nextDouble();
				Jefe.setPlusJefe(plusNuevo);
				
				break;
			case 3:
				visualizarDatosEmpleadosAlfabeticamente(listaEmpleados);
				break;
			case 4:
				visualizarDatosJefe(listaEmpleados);
				break;
			case 5:
				System.out.println("SALIENDO DEL MENU");
				break;
			default:
				System.out.println("ERROR");
				break;
				
			}
		}while(opcion!=5);

	}
	
	private static Empleado [] llenarLista(Empleado [] listaEmpleados) {
		listaEmpleados[0]=new Empleado("Adrian",23,2.5);
		listaEmpleados[1]=new Empleado("Jorge",26,4.5);
		listaEmpleados[2]=new Empleado("Carlos",22,1.5);
		listaEmpleados[3]=new Jefe("Sergio",23,5.5,"RRHH");
		listaEmpleados[4]=new Jefe("juan",45,6.5,"Ventas");
		return listaEmpleados;
		}
	
	private static void visualizarDatosEmpleadosAlfabeticamente(Empleado [] listaEmpleados){
		
		Arrays.sort(listaEmpleados, (e1,e2)->e1.getNombreEmpleado().compareToIgnoreCase(e2.getNombreEmpleado()));
		for(Empleado e:listaEmpleados) {
			System.out.println(e);
		}
	}
	
	private static void visualizarDatosJefe(Empleado [] listaEmpleados){
		for(Empleado e:listaEmpleados) {
			if(e instanceof Jefe) {
				System.out.println(e);
			}
		}
	}
	
}
