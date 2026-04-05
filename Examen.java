package hospital;

import java.time.LocalDate;

public class Examen {

    private int idExamen;
    private LocalDate fecha;
    private String tipoExamen;
    private String resultado;

    // CONSTRUCTOR
    public Examen(int idExamen, LocalDate fecha, String tipoExamen, String resultado) {
        this.idExamen = idExamen;
        this.fecha = fecha;
        this.tipoExamen = tipoExamen;
        this.resultado = resultado;
    }

    
    public int getIdExamen() {
        return idExamen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public String getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return tipoExamen + " - " + resultado + " (" + fecha + ")";
    }
}
