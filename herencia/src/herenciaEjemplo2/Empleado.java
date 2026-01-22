package herenciaEjemplo2;
/*
 * superclase Empleado.
 * Crearemos dos calses diferentes que hereden de ella
 * La clase EmpleadoFijo y EmpleadoTemporarl
 * 
 */
public class Empleado {
	//Atributo de la clase Empleado
	private String nombre;
	
	//Constructor
	public Empleado(String nombre) {
        this.nombre = nombre;
    }

	//metodo de la clase emplado
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
    }

}
