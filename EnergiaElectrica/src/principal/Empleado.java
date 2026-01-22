package principal;

public class Empleado {
  protected final static String NOMBREMPRESA="Eléctrica,SA";
  protected static double sueldoBase=1000;
  protected String nombreEmpleado;
  protected int edad;
  protected double porcentajeIncremento;
  
  public Empleado(String nombreEmpleado,int edad,double porcentajeIncremento) {
	  this.nombreEmpleado=nombreEmpleado;
	  this.edad=edad;
	  this.porcentajeIncremento=porcentajeIncremento;
  }
  
  public double calcularSueldoTotal() {
	  return sueldoBase+(sueldoBase*porcentajeIncremento)/100;
  }

  /**
 * @return the sueldoBase
 */
public static double getSueldoBase() {
	return sueldoBase;
}

  /**
   * @param sueldoBase the sueldoBase to set
   */
  public static void setSueldoBase(double sueldoBase) {
	Empleado.sueldoBase = sueldoBase;
  }

  @Override
  public String toString() {
	return "Empleado nombreEmpleado=" + nombreEmpleado + ", edad=" + edad + ", porcentajeIncremento="
			+ porcentajeIncremento + "Sueldo Total: "+ calcularSueldoTotal();
  }
  public String getNombreEmpleado() {
	  return nombreEmpleado;
  }
  
}
