
package herencia.ejercicio1;


public class App {
    public static void main(String[] args){
        Estudiante miEstudiante= new Estudiante(1020, "Luis", 20, 105030);
        System.out.println(miEstudiante);
        Administrativo miAdministrativo= new Administrativo(5089, "jordi", 25, "Decano", "IA", 1020300);
        System.out.println(miAdministrativo);
        System.out.println("Valor a pagar" + miAdministrativo.calcularSalario());
        Docente miDocente = new Docente("Matemáticas", 40, 50000, 2001, "Carlos", 45);
        System.out.println(miDocente);
        System.out.println("Valor a pagar: " + miDocente.calcularPago());
    }
}
