import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// creacion del scanner
		Scanner teclado = new Scanner(System.in);
		String oracion;

		do {
			System.out.println("Indique la oracion a evaluar (No puede estar vacia):");
			oracion = teclado.nextLine();
		} while (oracion.length() == 0);
		teclado.close();
		evaluarFrase(oracion);
	}

	public static void evaluarFrase(String mensaje) {
		String[] palabras = mensaje.split(" ");

		for (int i = 0; i < palabras.length; i++) {

			// evaluamos si es palindromo y de ser asi evaluamos si es un numero
			System.out.println(palabras[i] + " "
					+ (esPalindromo(palabras[i].trim())
							? (esNumero(palabras[i].trim()) ? "es Capicua" : "es Palindromo")
							: "No es Palidromo"));
		}

	}

	public static boolean esPalindromo(String palabra) {
		// si la pabra esta vacia no es considerada palindromo
		if (palabra.length() == 0) {
			return false;
		}

		// ponemos la palabra en minusculas
		palabra = palabra.toLowerCase();
		// creamos un ciclo para evaluar cada caracter, no es necesario revisar toda la palabra sino la mitad
		for (int i = 0, j = palabra.length() - 1; i < (palabra.length() / 2); i++, j--) {

			if (palabra.charAt(i) != palabra.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static boolean esNumero(String palabra) {
		char[] numeros = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		for (int i = 0; i < palabra.length(); i++) {
			char caracter = palabra.charAt(i);

			// si el caracter a evaluar esta dentro de los numeros retornamos que es numero.
			for (int j = 0; j < numeros.length; j++) {
				if (caracter == numeros[j]) {
					return true;
				}

			}
		}
		return false;
	}

}