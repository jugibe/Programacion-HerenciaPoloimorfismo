package herenciaEjemplo2;

/*
 * Clase EmpleadoTemporarl
 * Extiende empleado
 * 
 */

public class EmpleadoTemporal extends Empleado{
	
	private int diasContrato;

    public EmpleadoTemporal(String nombre, int diasContrato) {
        super(nombre);
        this.diasContrato = diasContrato;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Días de contrato: " + diasContrato);
    }

}
