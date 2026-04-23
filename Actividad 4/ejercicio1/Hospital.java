package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Paciente> pacientes;

    // CONSTRUCTOR
    public Hospital() {
        this.pacientes = new ArrayList<>();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    // Registrar paciente
    public void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    // Busca un paciente y lo devuelve (más útil que solo imprimirlo)
    public Paciente buscarPaciente(int idBuscado) {
        for (Paciente paciente : pacientes) {
            if (paciente.getId() == idBuscado) {
                return paciente;
            }
        }
        return null;
    }
    
    public void agregarExamen(Paciente paciente, Examen examen) { 
        paciente.agregarExamen(examen);
    }

    public void agregarTratamiento(Paciente paciente, Tratamiento tratamiento) { 
        paciente.agregarTratamiento(tratamiento);
    }

    // Conteo por tipo usando switch para mayor claridad
    public void mostrarNumeroPacientesPorTipoCancer() {
        int leucemia = 0, linfoma = 0, sarcoma = 0;

        for (Paciente paciente : pacientes) {
            String tipo = paciente.getTipoCancer().toLowerCase();

            switch (tipo) {
                case "leucemia": leucemia++; break;
                case "linfoma":  linfoma++;  break;
                case "sarcoma":  sarcoma++;  break;
            }
        }

        System.out.println("Leucemia: " + leucemia);
        System.out.println("Linfoma: " + linfoma);
        System.out.println("Sarcoma: " + sarcoma);
    }

    // Sobrecarga del método para buscar un tipo específico
    public void mostrarNumeroPacientesPorTipoCancer(String tipoCancer) { 
        int contador = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getTipoCancer().equalsIgnoreCase(tipoCancer)) {
                contador++;
            }
        }
        System.out.println("Total de pacientes con " + tipoCancer + ": " + contador);
    }
    

    public void mostrarPorcentaje(String etiqueta, int total, int cantidad) { 
        if (total == 0) {
            System.out.println("No se puede calcular porcentaje de " + etiqueta + " (total es 0).");
            return;
        }
        double porcentaje = (cantidad * 100.0) / total;
        System.out.printf("Porcentaje de %s: %.2f%%\n", etiqueta, porcentaje);
    }
}