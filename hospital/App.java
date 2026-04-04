package hospital;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        // Crear pacientes 
        Paciente p1 = new Paciente(1, "Ana", 30, "F", "Leucemia", 2, "en tratamiento");
        Paciente p2 = new Paciente(2, "Luis", 40, "M", "Linfoma", 3, "remision");
        Paciente p3 = new Paciente(3, "Carlos", 50, "M", "Sarcoma", 1, "fallecido");
        Paciente p4 = new Paciente(4, "Maria", 35, "F", "Leucemia", 2, "remision");
        Paciente p5 = new Paciente(5, "Sofia", 28, "F", "Linfoma", 1, "en tratamiento");
        Paciente p6 = new Paciente(6, "Pedro", 60, "M", "Sarcoma", 4, "fallecido");

        // Registrar pacientes
        hospital.registrarPaciente(p1);
        hospital.registrarPaciente(p2);
        hospital.registrarPaciente(p3);
        hospital.registrarPaciente(p4);
        hospital.registrarPaciente(p5);
        hospital.registrarPaciente(p6);

        // Crear exámenes 
        Examen e1 = new Examen(1, LocalDate.of(2026, 1, 1), "Biopsia", "Positivo");
        Examen e2 = new Examen(2, LocalDate.of(2026, 1, 2), "Biopsia", "Negativo");
        Examen e3 = new Examen(3, LocalDate.of(2026, 2, 3), "Tomografia", "Positivo");
        Examen e4 = new Examen(4, LocalDate.of(2026, 2, 4), "Tomografia", "Negativo");

        // Agregar exámenes
        p1.agregarExamen(e1);
        p1.agregarExamen(e3);
        p2.agregarExamen(e4);
        p2.agregarExamen(e1);
        p3.agregarExamen(e2);
        p3.agregarExamen(e4);
        // Crear tratamientos 
        Tratamiento t1 = new Tratamiento(1, "Quimioterapia", 30, "Nauseas");
        Tratamiento t2 = new Tratamiento(2, "Radioterapia", 20, "Fatiga");
        Tratamiento t3 = new Tratamiento(3, "Inmunoterapia", 35, "Dolor");

        // Agregar tratamientos
        p4.agregarTratamiento(t1);
        p4.agregarTratamiento(t2);
        p5.agregarTratamiento(t3);
        p5.agregarTratamiento(t2);
        p6.agregarTratamiento(t1);
        p6.agregarTratamiento(t3);

        // Mostrar resultados
        hospital.numeroPacientesPorTipoCancer();
        hospital.porcentajeEstados();
    }
}
