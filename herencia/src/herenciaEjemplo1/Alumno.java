package herenciaEjemplo1;
/*
 * Ejemplo básico de herencia. La clase Alumno hereda de la clase persona.
 * 
 */
public class Alumno extends Persona{//la palabra extends indica que hereda de la clase persona
	
	
	//Definimos solo los atributos propios de alumno. 
	//Un alumno es una Persona por lo que tendrá  un atributo nombre
	
	private String curso;
	
	/*
	 * Constructor
	 * Para construir un alumno necesitaremos darle un nombre y un curso.
	 * El nombre sera necesario para crear a parte Persona del Alumno.
	 */
	public Alumno(String nombre, String curso) {
		//llamamos al constructor de la clase Persona con el atributo alumno
		super(nombre);
		this.curso=curso; 
		// no se puede hacer this.nombre=nombre;
		System.out.println("Hemos utilzado el constructor de la clase alumno");
	}
	
	//metodo presentarse de la lase persona
		public void presentarse() {
			super.presentarse(); //lamo al método de la clase super presentarse()
			System.out.println("y ademas estoy en el curso "+ curso);
			
		}

}
