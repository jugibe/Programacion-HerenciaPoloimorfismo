package herenciaEjemplo1;
/*
 * Clase Principal.
 * Creamos objetos de la clase Persona y alumno
 * 
 */


public class Principal {

	public static void main(String[] args) {
		//Creo un objeto de la clase persona
		Persona p1=new Persona("Juanjo");
		p1.presentarse();
		
		//Creo un objero de la clase alumno
		Alumno a1=new Alumno("Miguel", "DAM1");
		//El método presentarse es el método de la clase Alumno
		a1.presentarse();
		
		
		
		//Atencion puedo definir un ovbjeto persona e instanciarlo como alumno
		
		Persona p2=new Alumno("luis", "DAW1"); //en tienpo de ejecución p2 se transforma en Alumno
		//como se presentara? como persona o como alumno?
		p2.presentarse();
		
		
		//metodo que devuelve la clase a la que pertendce un objeto
		System.out.println(p2.getClass());
		
		//operador que indica si un objeto es una instancia de una clase.
		System.out.println("#############################");
		
		System.out.println("p2 es Persona");
		System.out.println(p2 instanceof Persona);
		System.out.println("p2 es Alumno");
		System.out.println(p2 instanceof Alumno);
		System.out.println("p1 es Alumno");
		System.out.println(p1 instanceof Alumno);
		System.out.println("a1 es Persona");
		System.out.println(a1 instanceof Persona);
		

	}

}
