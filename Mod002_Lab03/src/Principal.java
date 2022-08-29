
public class Principal {
	public static void main(String[] args) {

		int intensidadRojo;
		int intensidadVerde;
		int intensidadAzul;
		int maximo = 255;

		intensidadRojo = (int) (Math.random() * maximo) + 1;
		intensidadVerde = (int) (Math.random() * maximo) + 1;
		intensidadAzul = (int) (Math.random() * maximo) + 1;

		System.out.println("Color RGB(" + intensidadRojo + ", " + intensidadVerde + ", " + intensidadAzul + ")");


	}
}
