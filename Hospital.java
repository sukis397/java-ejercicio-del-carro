package hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Paciente> pacientes;

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    // CONSTRUCTOR
    public Hospital() {
        pacientes = new ArrayList<>();
    }
    
    public void buscarPaciente(int idBuscado) {
    boolean encontrado = false;
    
    for (Paciente p : pacientes) {
        if (p.getId() == idBuscado) { 
            System.out.println("Paciente encontrado: " + p.getNombre() + " (ID: " + p.getId() + ")");
            encontrado = true;
            break; 
        }
    }

    if (!encontrado) {
        System.out.println("No se encontro ningun paciente con el ID: " + idBuscado);
    }
}
    

    // Registrar paciente
    public void registrarPaciente(Paciente p) {
        pacientes.add(p);
    }
    
    public void agregarExamen(Paciente p, Examen e) { 
        p.agregarExamen(e);
    }

    public void agregarTratamiento(Paciente p, Tratamiento t) { 
    p.agregarTratamiento(t);
    }

    // Contar pacientes por tipo de cáncer
    public void numeroPacientesPorTipoCancer() {
        int leucemia = 0, linfoma = 0, sarcoma = 0;

        for (Paciente p : pacientes) {
            String tipo = p.getTipoCancer().toLowerCase();

            if (tipo.equals("leucemia")) {
                leucemia++;
            } else if (tipo.equals("linfoma")) {
                linfoma++;
            } else if (tipo.equals("sarcoma")) {
                sarcoma++;
            }
        }

        System.out.println("Leucemia: " + leucemia);
        System.out.println("Linfoma: " + linfoma);
        System.out.println("Sarcoma: " + sarcoma);
    }

    public void numeroPacientesPorTipoCancer(String tipoCancer, List<Paciente> listaPacientes) { 
        int contador = 0;
        for (Paciente p : listaPacientes) {
            if (p.getTipoCancer().equalsIgnoreCase(tipoCancer)) {
                contador++;
            }
        }
        System.out.println("Total de pacientes con " + tipoCancer + ": " + contador);
    }
    
    public void PorcentajeRemision(int total, int pacientesRemision) { 
        double porcentaje = (pacientesRemision * 100.0) / total;
        System.out.printf("Porcentaje en Remision: %.2f%%\n", porcentaje);
    }

    public void PorcentajeTratamiento(int total, int pacientesTratamiento) {
        double porcentaje = (pacientesTratamiento * 100.0) / total;
        System.out.printf("Porcentaje en Tratamiento: %.2f%%\n", porcentaje);
    }

    public void PorcentajeFallecido(int total, int pacientesFallecido) { 
        double porcentaje = (pacientesFallecido * 100.0) / total;
        System.out.printf("Porcentaje Fallecidos: %.2f%%\n", porcentaje);
    }
}
    

