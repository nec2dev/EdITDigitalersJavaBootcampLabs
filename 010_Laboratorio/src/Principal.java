
public class Principal {

	public static void main(String[] args) {
		char opcion = 'A';

		switch (opcion) {
		case 'A':
			System.out.println("Ha seleccionado Documentaci�n");
			break;
		case 'B':
			System.out.println("Ha seleccionado Cotizaci�n");
			break;
		case 'C':
			System.out.println("Ha seleccionado Asistencia");
			break;
		case 'D':
			System.out.println("Ha seleccionado Siniestros");
			break;
		case 'E':
			System.out.println("Ha seleccionado Informaci�n de Pagos");
			break;
		case 'F':
			System.out.println("Ha seleccionado Otras Consultas");
			break;
		case 'G':
			System.out.println("Ha seleccionado Anulaci�n");
			break;
		default:
			System.out.println("Opcion Incorrecta");
		}

	}

}