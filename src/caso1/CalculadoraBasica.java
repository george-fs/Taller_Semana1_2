package caso1;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		// inicio del programa principal
		Scanner ingreso = new Scanner(System.in);
		
		System.out.println("--- CASO 1 CALCULADORA BASICA ---");
		System.out.println();
				
		System.out.print("Ingrese Numero 1: ");
		double num1 = ingreso.nextDouble();
		
		System.out.print("Ingrese Numero 2: ");
		double num2 = ingreso.nextDouble();

		System.out.println("\nSeleccione Opcion: ");
		System.out.println("1. Suma (+)");
		System.out.println("2. Resta (-)");
		System.out.println("3. Multiplicacion (x)");
		System.out.println("4. Division (/)");
		System.out.print("Opcion elejida (1-4) : ");
		int opc = ingreso.nextInt();
		System.out.println();
		
		switch (opc) {
			case 1:
				System.out.println("La suma es: " + suma(num1, num2));
				break;
			case 2:
				System.out.println("La resta es: " + resta(num1, num2));
				break;
			case 3:
				System.out.println("La multiplicacion es: " + producto(num1, num2));
				break;
			case 4:
				if (num2!=0) {
					System.out.println("La division es: " + cociente(num1, num2));
				} else {
					System.out.println("No es posible la division por 0");		
				}
				break;
			default:
				System.out.println("Opcion Incorrecta, Intente otra vez");
				break;
		}
		ingreso.close();
	}
	
	public static double suma(double x, double y) {
		return x + y;		
	}
	
	public static double resta(double x, double y) {
		return x - y;
	}
	
	public static double producto(double x, double y) {
		return x * y;
	}
	
	public static double cociente(double x, double y) {
		return x / y;
	}

}
