
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaramos las variables
		int cantidadHorasTotales = 1500;
		int cantidadSemanas;
		int cantidadDias;
		int cantidadHoras;
		int restoSemanas;
		// calculamos las semanas 
		cantidadSemanas = 1500 / (24 * 7);
				
		// tomamos las horas que restan de la semana
		restoSemanas = 1500 % (24 * 7);
				
		// calculamos los dias 
		cantidadDias = restoSemanas / 24;
				
		// calculamos las horas restantes
		cantidadHoras = restoSemanas % 24;

		System.out.println("Cantidad de horas totales: " + cantidadHorasTotales);
		System.out.println();
		System.out.println("Semanas: " + cantidadSemanas);
		System.out.println("Dias: " + cantidadDias);
		System.out.println("Horas: " + cantidadHoras);
	}

}
