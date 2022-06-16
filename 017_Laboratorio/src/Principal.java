import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float a;
		float b;
		char operador;
		char[] operadoresValidos = { '+', '-', '*', '/', '%' };
		boolean operadorValido = false;
		// creacion del scanner
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese un numero a : ");
		a = teclado.nextFloat();

		System.out.print("Ingrese un numero b : ");
		b = teclado.nextFloat();

		do {

			System.out.print("Ingrese la operacion que desea realizar " + Arrays.toString(operadoresValidos) + " : ");
			operador = teclado.next().charAt(0);

			for (int i = 0; i < operadoresValidos.length; i++) {
				if (operador == operadoresValidos[i]) {
					operadorValido = true;
					break;
				}

			}

		} while (!operadorValido);

		teclado.close();
		operar(a, b, operador);
	}

	public static void operar(float a, float b, char operador) {
		String mensaje = a + " " + operador + " " + b + " = ";

		switch (operador) {
		case '+':
			System.out.println(mensaje + sumar(a, b));
			break;
		case '-':
			System.out.println(mensaje + restar(a, b));
			break;
		case '*':
			System.out.println(mensaje + multiplicar(a, b));
			break;
		case '/':
			System.out.println(mensaje + dividir(a, b));
			if (b == 0) {
				System.out.println(
						"Recuerde que si un numero es divido por cero existen infinitos resultados correctos.");
			}
			break;
		case '%':
			System.out.println(mensaje + restoDivision(a, b));
			break;
		default:
			System.out.println("Ha indicado un operador no valido...");
			break;
		}

	}

	public static float sumar(float a, float b) {
		return a + b;
	}

	public static float restar(float a, float b) {
		return a - b;
	}

	public static float multiplicar(float a, float b) {
		return a * b;
	}

	public static float dividir(float a, float b) {
		return a / b;
	}

	public static float restoDivision(float a, float b) {
		return a % b;
	}
}