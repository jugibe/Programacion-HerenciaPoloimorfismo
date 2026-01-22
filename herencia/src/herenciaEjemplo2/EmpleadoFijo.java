package herenciaEjemplo2;
/*
 * Clase EmpleadoFijo
 * hereda de Empleado
 * Su unico atributo es sueldoMensual
 * tiene un metodo mostrarInfo()
 * sobreescribe el métpd de la clase super
 */

public class EmpleadoFijo extends Empleado{
	//atributo de la clase EmpleadoFijo
	private double salarioMensual;	
	//Constructor de la clase EmpleadoFijo
    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre); // constructor de la superclase
        this.salarioMensual = salarioMensual;
    }

    //Sobreescribimos el método mostrarinfo() de la clase super
    //Se decide en función del objeto instanciado el metodo
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Salario: " + salarioMensual);
    }

}
