
package herencia.ejercicio1;

public class Estudiante extends Persona {
    
    private int codigo;

    public Estudiante(int id, String nombre, int edad, int codigo) {
        super(id, nombre, edad);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante " + super.toString() + "codigo " + this.codigo;
    }
}
