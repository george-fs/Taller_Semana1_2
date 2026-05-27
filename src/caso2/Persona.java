package caso2;

public class Persona {
	// Atributos encapsulados - privados
	private String nombre;
	private int edad;
	// Constructor - inicializa el objeto
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}	
	// Metodo - muestra datos
	public void mostrarDatos() {
		System.out.println("---------------------------");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad + " años");
	}
	//Ejemplo de Encapsulamiento basico
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
