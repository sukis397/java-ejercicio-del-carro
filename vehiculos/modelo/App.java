package modelo;

public class App {
    public static void main(String[] args) {
        
        System.out.println("--- VERIFICACIÓN DE VEHÍCULOS ---");
        System.out.println();

     
        
        Carro miCarro = new Carro("CAR-123", "Toyota", 180.0, 4);
        Moto miMoto = new Moto("MTC-789", "Yamaha", 220.0, "Deportiva");
        Camion miCamion = new Camion("TRK-555", "Volvo", 100.0, 15.0);


        System.out.println(miCarro.toString());
        System.out.println(miMoto.toString());
        System.out.println(miCamion.toString());
        
        System.out.println("\n--- Pruebas de Comportamiento (Mover) ---");

 
        miCarro.mover();
        miMoto.mover();
        miCamion.mover();

        System.out.println("\n--- Cálculo de Peajes ---");

     
        System.out.println("Peaje Carro: $" + miCarro.calcularPeaje());
        System.out.println("Peaje Moto: $" + miMoto.calcularPeaje());
        System.out.println("Peaje Camión: $" + miCamion.calcularPeaje());
        
        System.out.println("\n---------------------------------");
    }
}