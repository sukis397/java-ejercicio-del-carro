
package herencia.ejercicio1;


public class Docente extends Persona {
    private String especialidad;
    private int horasCatedra;
    private double valorHora;

    public Docente(String especialidad, int horasCatedra, double valorHora, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.especialidad = especialidad;
        this.horasCatedra = horasCatedra;
        this.valorHora = valorHora;
    }

   

    @Override
    public String toString() {
        return "Docente " + super.toString() +  "especialidad " + this.especialidad + ", salario " + calcularPago();
    }
    
    public double calcularPago(){
        double bruto= horasCatedra*valorHora;
        return bruto-(bruto*0.12);
    }
    public void mostrarInformacion() {
        System.out.println(this.toString());
}
}
