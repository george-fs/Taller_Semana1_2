package caso2;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Jorge Flores", 54);
		Persona persona2 = new Persona("Obi-Wan Kenobi", 90);
		System.out.println("=== REPORTE DE PERSONAS (POO) ===");
		persona1.mostrarDatos();
		persona2.mostrarDatos();
		System.out.println("---------------------------");
	}

}
