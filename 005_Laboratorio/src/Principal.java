import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra;
		char letra;
		int ascii;
		System.out.print("Indique una palabra: ");
		palabra = teclado.next();

		ascii = (int) ((Math.random() * 25) + 97);

		letra = (char) ascii;

		System.out.println(
				"La letra " + letra + " se encuentra en " + palabra + "? " + palabra.contains(String.valueOf(letra)));
		teclado.close();
	}
}
