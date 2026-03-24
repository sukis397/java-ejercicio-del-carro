package fabrica;

public class Llanta {
    private String marca;

    public Llanta(String marca) {
        super();
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return " Marca " + marca;
    }

}
