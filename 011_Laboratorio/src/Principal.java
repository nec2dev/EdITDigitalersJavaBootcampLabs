import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// creacion del scanner
		Scanner teclado = new Scanner(System.in);

		// creacion de variables
		int total = 0;
		int numUsuario = 0;
		System.out.println("Suma de numeros enteros:");
		System.out.print("Para Salir escriba 0 de lo contrario escriba cualquier numero: ");
		numUsuario = teclado.nextInt();

		while (numUsuario != 0) {
			total += numUsuario;
			System.out.print("Para Culminar escriba 0 de lo contrario escriba cualquier numero: ");
			numUsuario = teclado.nextInt();
		}

		System.out.println("La suma total es: " + total);
		// cerramos el scanner para que no siga consumiendo recursos
		teclado.close();

	}

}