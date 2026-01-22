package herenciaEjemplo3;
/*
 * Clase principal 
 * Creamos varios animales
 */
public class Principal {

	public static void main(String[] args) {
		//Cre on Array de animales
		Animal[] listaAnimales=new Animal[20];
		
		//Instancio en el array diferenrtes clases de animales, 
		//lo elijo al azar
		int opcion;
		for(int i=0;i<listaAnimales.length;i++) {
			opcion=(int)(Math.random()*4);
			switch (opcion){
			case 0:
				listaAnimales[i]=new Animal();
			break;
			case 1:
				listaAnimales[i]=new Perro();
			break;
			case 2:
				listaAnimales[i]=new Pollito();
			break;
			case 3:
				listaAnimales[i]=new Vaca();
			break;
			
			}
			
		}
		
		//imprimo los animales y su sonido
		for(Animal a: listaAnimales) {
			System.out.println("Soy un " + a.getClass()+ " " + a.sonido());
		}
		//Cuento os perros
		int contador =0;
		for(Animal a: listaAnimales) {
			if(a instanceof Perro) {
				contador ++;
				System.out.println(((Perro)a).ladrar());
				
			}
		}
		System.out.println("Numero de perros "+ contador);
		
		

	}

}
