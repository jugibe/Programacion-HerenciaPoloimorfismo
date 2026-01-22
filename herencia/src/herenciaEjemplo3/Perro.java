package herenciaEjemplo3;
/*
 * Subclase Perro
 * 
 */
public class Perro extends Animal{
	
	@Override
	public String sonido() {
		return "guau";
        
    }
	
	public String ladrar() {
		return "perrete";
	}
	
	
}
