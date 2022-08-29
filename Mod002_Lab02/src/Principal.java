import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String parrafo1;
		String parrafo2;
		System.out.print("Ingrese un parrafo: ");
		parrafo1 = teclado.nextLine();

		System.out.print("Ingrese otro parrafo: ");
		parrafo2 = teclado.nextLine();

		System.out.println("Son iguales bit a bit? : " + (parrafo1 == parrafo2));

		System.out.println("Son iguales en contenido? : " + parrafo1.equalsIgnoreCase(parrafo2));

		System.out.println();
		System.out.println("Parrafos en Mayusculas:");

		System.out.println(parrafo1.toUpperCase() + "\n" + parrafo2.toUpperCase());

		System.out.println();
		System.out.println("Parrafos en Minusculas:");

		System.out.println(parrafo1.toLowerCase() + "\n" + parrafo2.toLowerCase());

		System.out.println();
		System.out.println("Primera letra en Mayusculas:");

		String parrafo1PrimeraLetraMayuscula = parrafo1.substring(0, 1).toUpperCase()
				+ parrafo1.substring(1).toLowerCase();
		System.out.println(parrafo1PrimeraLetraMayuscula);
		
		System.out.println();
		System.out.println("Primera letra en Minusculas:");
		String parrafo2PrimeraLetraMayuscula = parrafo2.substring(0, 1).toUpperCase()
				+ parrafo2.substring(1).toLowerCase();



		System.out.println(parrafo2PrimeraLetraMayuscula);

		System.out.println(String.join(" , ", parrafo1, parrafo2));

		teclado.close();
	}

}
