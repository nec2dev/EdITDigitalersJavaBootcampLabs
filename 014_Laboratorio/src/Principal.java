import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] palabras;
		String oracion = "";
		String palabraAuxiliar="";
		char[] letras;
		
		do {
		System.out.println("Ingrese la oraci�n a evaluar (no puede estar vac�a)");
			oracion = scanner.nextLine();
		} while(oracion.length() == 0);
		
		palabras = oracion.split(" ");
		System.out.println("1: En la oraci�n ingresada hay " + palabras.length + " palabras");
		
		
		int contadorAuxiliar = 0;
		for(int i=0; i<palabras.length; i++) {
			palabraAuxiliar = palabras[i];
			for (int j=i+1; j<palabras.length; j++) {
				if (palabras[j].equals(palabraAuxiliar)) {
					contadorAuxiliar++;
				}
			}
		}
		System.out.println("2: En la oraci�n hay " + contadorAuxiliar + " palabras repetidas");
		 scanner.close();

		oracion = oracion.replace(" ", "");
		letras = oracion.toCharArray();

		Arrays.sort(palabras);
		Arrays.sort(letras);

		System.out.println("Palabras Ordenadas: ");
		System.out.println(Arrays.toString(palabras));

		System.out.println("Letras Ordenadas: ");
		System.out.println(Arrays.toString(letras));
		scanner.close();
	}

}