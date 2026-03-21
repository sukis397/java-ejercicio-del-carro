package banco;
/**
 * La clase Persona representa a una persona que
posee una o más cuentas dentro del banco.
 */
public class Persona {
	//Atributo de instancia
	private String nombre;
	/**
	 * Constructor 
	 * @param nombre de laPersona
	 */
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre" + this.nombre;
	}
}

