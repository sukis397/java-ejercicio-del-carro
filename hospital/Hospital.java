package hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Paciente> pacientes;

    // CONSTRUCTOR
    public Hospital() {
        pacientes = new ArrayList<>();
    }

    // Registrar paciente
    public void registrarPaciente(Paciente p) {
        pacientes.add(p);
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

    // Porcentaje por estado
    public void porcentajeEstados() {
        int remision = 0, tratamiento = 0, fallecido = 0;
        //toLowerCase() es para q quede el string en imnusculas
        for (Paciente p : pacientes) {
            String estado = p.getEstadoActual().toLowerCase();

            if (estado.equals("remision")) {
                remision++;
            } else if (estado.equals("en tratamiento")) {
                tratamiento++;
            } else if (estado.equals("fallecido")) {
                fallecido++;
            }
        }

        int total = pacientes.size();

        System.out.printf("Remisión: %.2f%%\n", (remision * 100.0 / total));
        System.out.printf("En tratamiento: %.2f%%\n", (tratamiento * 100.0 / total));
        System.out.printf("Fallecido: %.2f%%\n", (fallecido * 100.0 / total));
    }
}
