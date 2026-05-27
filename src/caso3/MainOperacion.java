package caso3;

public class MainOperacion {

	public static void main(String[] args) {
		// Creamos el objeto suma de la clase sumar
		Operacion suma = new Operacion();
		//imprime por consola el resultado
		System.out.println(suma.sumar(5, 8));
		System.out.println(suma.sumar(41, 12, 3));
		System.out.println(suma.sumar(8.5, 3.9));
	}
}
