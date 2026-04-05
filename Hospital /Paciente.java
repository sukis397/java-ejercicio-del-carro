package hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private int id;
    private String nombre;
    private int edad;
    private String genero;
    private String tipoCancer;
    private int etapa;
    private String estadoActual;

    private List<Examen> examenes;
    private List<Tratamiento> tratamientos;

    // CONSTRUCTOR
    public Paciente(int id, String nombre, int edad, String genero,
                    String tipoCancer, int etapa, String estadoActual) {

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoCancer = tipoCancer;
        this.etapa = etapa;
        this.estadoActual = estadoActual;

        this.examenes = new ArrayList<>();
        this.tratamientos = new ArrayList<>();
    }

    // MÉTODOS
    public void agregarExamen(Examen examen) {
        examenes.add(examen);
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
    }

    
    public int getId() {
        return id;
    }

    public String getTipoCancer() {
        return tipoCancer;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public int getEtapa() {
        return etapa;
    }


    @Override
    public String toString() {
        return nombre + " (" + tipoCancer + ")";
    }
}
