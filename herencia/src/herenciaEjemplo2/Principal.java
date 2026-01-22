package herenciaEjemplo2;
/*
 * Clase Principal
 * Instanciaremos objetos de las calses EmpleadoFijo y EmpleadoTEporarl y comprobaremos la
 * sobreescritura del método mostrarInfo()
 * Polimorfismo es la capacidad de usar una misma referencia 
 * para objetos de distintas subclases, 
 * haciendo que el mismo método se comporte de forma diferente según el objeto real.
 */

public class Principal {

	public static void main(String[] args) {
		//Creo un array de tres Empleados
		//los eleentos pueden ser Empleados u objetos de clases heredadas
		
		Empleado[]listaEmpleados=new Empleado [3];
		
		//lleno e array de Empleados
		listaEmpleados[0]=new EmpleadoTemporal("juan", 7);
		listaEmpleados[1]=new EmpleadoFijo("Ana",1200);
		listaEmpleados[2]=new Empleado("Esther");
		
		//recorro y muestro el array de empleados
		for (Empleado e: listaEmpleados) {
			//Cada objeto Empleado ejecutara un metodo distinto mostrarInfo()
			e.mostrarInfo();
		}
		

	}

}
