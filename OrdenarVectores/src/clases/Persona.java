package clases;
/*
 * Clase Persona.
 * Al implementar la interface Comparable se pueden ordenar los elementos de una lista
 * usando el metodo sort
 */
public class Persona implements Comparable{
	//Atributos de la clase
	private String nombre;
	private Integer edad;
	private Double altura;
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Persona(String nombre, Integer edad, Double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	
	/*
	 * Metodo comapreTo 
	 * objeto.comapareTo(objeto)
	 * Devuelve un numero negativo, positivo o cero
	 * Establece un ordenamiento Natural en la clase Persona
	 * Usamos el CompareTo de los datos primitivos int, doble o String
	 * En este caso ordenamos establcecmos la edad como criterio de comparacion
	 */
	@Override
	public int compareTo(Object o) {	
		return this.getAltura().compareTo(((Persona) o).getAltura());	
	}
	

}
