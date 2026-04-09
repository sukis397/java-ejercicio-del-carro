package ejercicio1;

public class Tratamiento {

    private int idTratamiento;
    private String nombre;
    private int duracionDias;
    private String efectosSecundarios;

    // CONSTRUCTOR
    public Tratamiento(int idTratamiento, String nombre, int duracionDias, String efectosSecundarios) {
        this.idTratamiento = idTratamiento;
        this.nombre = nombre;
        this.duracionDias = duracionDias;
        this.efectosSecundarios = efectosSecundarios;
    }

   
    public int getIdTratamiento() {
        return idTratamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public String getEfectosSecundarios() {
        return efectosSecundarios;
    }

    //METODOSS
    public double calcularEficacia(String tipoCancer) {
        if (tipoCancer.equalsIgnoreCase("Leucemia")) {
            return 0.7;
        } else if (tipoCancer.equalsIgnoreCase("Linfoma")) {
            return 0.6;
        } else {
            return 0.5;
        }
    }

    
    @Override
    public String toString() {
        return nombre + " (" + duracionDias + " días)";
    }
}