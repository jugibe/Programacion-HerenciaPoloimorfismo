package principal;

public class Jefe extends Empleado {
  private static double plusJefe=250;
  private String nombreDepartamento;
  
   public Jefe(String nombreEmpleado,int edad,double porcentajeIncremento,String nombreDepartamento) {
	   super(nombreEmpleado,edad,porcentajeIncremento);
	   this.nombreDepartamento=nombreDepartamento;
	   
   }
   
   public double calcularSueldoTotal() {
		  return super.calcularSueldoTotal()+plusJefe;
	  }

   @Override
   public String toString() {
	return "Jefe nombreDepartamento=" + nombreDepartamento + ", nombreEmpleado=" + nombreEmpleado + ", edad=" + edad
			+ ", porcentajeIncremento=" + porcentajeIncremento + "Sueldo Total: "+calcularSueldoTotal();
   }

   /**
    * @return the plusJefe
    */
   public static double getPlusJefe() {
	return plusJefe;
   }

   /**
    * @param plusJefe the plusJefe to set
    */
   public static void setPlusJefe(double plusJefe) {
	Jefe.plusJefe = plusJefe;
   }
}
