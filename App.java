package hospital;

import java.time.LocalDate;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Paciente p1 = new Paciente(1, "Ana", 30, "F", "Leucemia", 2, "en tratamiento");
        Paciente p2 = new Paciente(2, "Luis", 40, "M", "Linfoma", 3, "remision");
        Paciente p3 = new Paciente(3, "Carlos", 50, "M", "Sarcoma", 1, "fallecido");
        Paciente p4 = new Paciente(4, "Maria", 35, "F", "Leucemia", 2, "remision");
        Paciente p5 = new Paciente(5, "Sofia", 28, "F", "Linfoma", 1, "en tratamiento");
        Paciente p6 = new Paciente(6, "Pedro", 60, "M", "Sarcoma", 4, "fallecido");

        hospital.registrarPaciente(p1);
        hospital.registrarPaciente(p2);
        hospital.registrarPaciente(p3);
        hospital.registrarPaciente(p4);
        hospital.registrarPaciente(p5);
        hospital.registrarPaciente(p6);

        Examen e1 = new Examen(1, LocalDate.of(2026, 1, 1), "Biopsia", "Positivo");
        Examen e2 = new Examen(2, LocalDate.of(2026, 1, 2), "Biopsia", "Negativo");
        Examen e3 = new Examen(3, LocalDate.of(2026, 2, 3), "Tomografia", "Positivo");
        Examen e4 = new Examen(4, LocalDate.of(2026, 2, 4), "Tomografia", "Negativo");

        Tratamiento t1 = new Tratamiento(1, "Quimioterapia", 30, "Nauseas");
        Tratamiento t2 = new Tratamiento(2, "Radioterapia", 20, "Fatiga");
        Tratamiento t3 = new Tratamiento(3, "Inmunoterapia", 35, "Dolor");

        hospital.agregarExamen(p1, e1);
        hospital.agregarExamen(p1, e3);
        hospital.agregarExamen(p2, e4);
        hospital.agregarExamen(p2, e1);
        hospital.agregarExamen(p3, e2);
        hospital.agregarExamen(p3, e4);

        hospital.agregarTratamiento(p4, t1);
        hospital.agregarTratamiento(p4, t2);
        hospital.agregarTratamiento(p5, t3);
        hospital.agregarTratamiento(p5, t2);
        hospital.agregarTratamiento(p6, t1);
        hospital.agregarTratamiento(p6, t3);

        System.out.println("REPORTE HOSPITALARIO:");

        System.out.println("\n[1] Verificacion de Paciente por ID:");
        hospital.buscarPaciente(1); 

       
        System.out.println("\n[2] Conteo de Casos:");
        List<Paciente> listaPacientes = hospital.getPacientes();
        hospital.numeroPacientesPorTipoCancer("Leucemia", listaPacientes);
        hospital.numeroPacientesPorTipoCancer("Linfoma", listaPacientes);
        hospital.numeroPacientesPorTipoCancer("Sarcoma", listaPacientes);

     
        System.out.println("\n[3] Estadisticas Generales:");
        int total = listaPacientes.size();
        hospital.PorcentajeRemision(total, 2);
        hospital.PorcentajeTratamiento(total, 2);
        hospital.PorcentajeFallecido(total, 2);

     
        System.out.println("\n[4] Detalle de Tratamiento y Eficacia:");
        double eficacia = t1.calcularEficacia(p4.getTipoCancer());
        System.out.println("Paciente: " + p4.getNombre());
        System.out.println("Tratamiento: " + t1.getNombre());
        System.out.println("Eficacia calculada: " + (eficacia * 100) + "%");
        System.out.println("Efectos secundarios: " + t1.getEfectosSecundarios());

    }
}