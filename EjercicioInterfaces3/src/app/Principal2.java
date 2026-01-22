package app;

import clases.*;


public class Principal2 {

	public static void main(String[] args) {
		//usamos la clase datos
		Datos d=new Datos(new int [] {1,2,3});
		d.setO(new Sumador());
		d.mostrarInforme();
		//podemos definirlo aqui
		d.setO((v)->metodo(d.getDatos()));
		d.mostrarInforme();
	}

	private static int metodo(int[] is) {
		int max=is[0];
		for(int i:is) {
			max=(i>max)?i:max;
		}
		return max;
		
		
	}

}
