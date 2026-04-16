package modelo;

public class Carro extends Vehiculo {

    private int numeroPuertas;

   
    public Carro(String placa, String marca, double velocidadMaxima, int numeroPuertas) {
       
        super(placa, marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mover() {
        System.out.println("El carro con placa " + placa + " avanza por la ciudad con sus " + numeroPuertas + " puertas cerradas.");
    }

    @Override
    public double calcularPeaje() {
        
        return 10000.0;
    }

    @Override
    public String toString() {
        
        return super.toString() + " | Puertas: " + numeroPuertas;
    }
}