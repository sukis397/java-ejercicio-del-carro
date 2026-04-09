package ejercicio1;

import java.time.LocalDate;

public class Sistema {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

     
        Paciente paciente;
        
        paciente = new Paciente(1, "Ana", 30, "F", "Leucemia", 2, "en tratamiento");
        hospital.registrarPaciente(paciente);
        
        paciente = new Paciente(2, "Luis", 40, "M", "Linfoma", 3, "remision");
        hospital.registrarPaciente(paciente);
        
        paciente = new Paciente(3, "Carlos", 50, "M", "Sarcoma", 1, "fallecido");
        hospital.registrarPaciente(paciente);
        
        paciente = new Paciente(4, "Maria", 35, "F", "Leucemia", 2, "remision");
        hospital.registrarPaciente(paciente);
        
        paciente = new Paciente(5, "Sofia", 28, "F", "Linfoma", 1, "en tratamiento");
        hospital.registrarPaciente(paciente);
        
        paciente = new Paciente(6, "Pedro", 60, "M", "Sarcoma", 4, "fallecido");
        hospital.registrarPaciente(paciente);

        
        Examen examen;
        Tratamiento tratamiento;

        
        paciente = hospital.buscarPaciente(1);
        if (paciente != null) {
            examen = new Examen(1, LocalDate.of(2026, 1, 1), "Biopsia", "Positivo");
            hospital.agregarExamen(paciente, examen);
            
            examen = new Examen(3, LocalDate.of(2026, 2, 3), "Tomografia", "Positivo");
            hospital.agregarExamen(paciente, examen);
        }

        paciente = hospital.buscarPaciente(2);
        if (paciente != null) {
            examen = new Examen(4, LocalDate.of(2026, 2, 4), "Tomografia", "Negativo");
            hospital.agregarExamen(paciente, examen);
            
            examen = new Examen(1, LocalDate.of(2026, 1, 1), "Biopsia", "Positivo");
            hospital.agregarExamen(paciente, examen);
        }

        paciente = hospital.buscarPaciente(3);
        if (paciente != null) {
            examen = new Examen(2, LocalDate.of(2026, 1, 2), "Biopsia", "Negativo");
            hospital.agregarExamen(paciente, examen);
            examen = new Examen(4, LocalDate.of(2026, 2, 4), "Tomografia", "Negativo");
            hospital.agregarExamen(paciente, examen);
        }

        
        paciente = hospital.buscarPaciente(4);
        if (paciente != null) {
            tratamiento = new Tratamiento(1, "Quimioterapia", 30, "Nauseas");
            hospital.agregarTratamiento(paciente, tratamiento);
            
            tratamiento = new Tratamiento(2, "Radioterapia", 20, "Fatiga");
            hospital.agregarTratamiento(paciente, tratamiento);
        }

        paciente = hospital.buscarPaciente(5);
        if (paciente != null) {
            tratamiento = new Tratamiento(3, "Inmunoterapia", 35, "Dolor");
            hospital.agregarTratamiento(paciente, tratamiento);
            
            tratamiento = new Tratamiento(2, "Radioterapia", 20, "Fatiga");
            hospital.agregarTratamiento(paciente, tratamiento);
        }

        paciente = hospital.buscarPaciente(6);
        if (paciente != null) {
            tratamiento = new Tratamiento(1, "Quimioterapia", 30, "Nauseas");
            hospital.agregarTratamiento(paciente, tratamiento);
            
            tratamiento = new Tratamiento(3, "Inmunoterapia", 35, "Dolor");
            hospital.agregarTratamiento(paciente, tratamiento);
        }

        System.out.println("REPORTE HOSPITALARIO\n");


        paciente = hospital.buscarPaciente(4);
        if (paciente != null) {
            System.out.println("\n[1] Búsqueda Individual:");
            System.out.println("Paciente: " + paciente.getNombre() + " | Estado: " + paciente.getEstadoActual());
        }

        System.out.println("\n[2] Conteo de Casos:");
        hospital.mostrarNumeroPacientesPorTipoCancer("Leucemia");
        hospital.mostrarNumeroPacientesPorTipoCancer("Linfoma");
        hospital.mostrarNumeroPacientesPorTipoCancer("Sarcoma");

        System.out.println("\n[3] Estadísticas de Estado:");
        int total = hospital.getPacientes().size();

        hospital.mostrarPorcentaje("Remisión", total, 2);
        hospital.mostrarPorcentaje("En Tratamiento", total, 2);
        hospital.mostrarPorcentaje("Fallecidos", total, 2);

        System.out.println("\n[4] Análisis de Eficacia:");
        paciente = hospital.buscarPaciente(4);
        if (paciente != null) {

            String tipo = paciente.getTipoCancer();
            tratamiento = new Tratamiento(1, "Quimioterapia", 30, "Nauseas");
            System.out.println("Eficacia de " + tratamiento.getNombre() + " para " + paciente.getNombre() + ": " + (tratamiento.calcularEficacia(tipo) * 100) + "%");
        }
    }
}