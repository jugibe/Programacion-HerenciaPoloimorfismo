package herenciaEjemplo1;
/*
 * Ejemplo básico de superclase 
 * clase Persona. 
 */



public class Persona {
	
	private String nombre;
	
	//Constructor de la lase Persona
	public Persona(String nombre) {
		this.nombre=nombre;
		//mensaje para indicar que hemos utilizado el construtor de Persona
		System.out.println("Hemos utilizado el constructor de la clase Persona");
	}
	
	
	//metodo presentarse de la lase persona
	public void presentarse() {
		System.out.println("Hola mi nombre es "+ nombre);
		
	}

}
